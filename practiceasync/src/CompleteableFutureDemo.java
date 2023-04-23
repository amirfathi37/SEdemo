import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompleteableFutureDemo {
    public static void main(String[] args) throws InterruptedException {
        FlightService flightService = new FlightService();
        Stream<CompletableFuture<Quote>> futureStream = flightService.getQuotes();
        futureStream.map(future-> future.thenAccept(System.out::println))
                .collect(Collectors.toList());



        Thread.sleep(1000000);
    }
    String string = "select njp.petition_type,\n" +
            "       case njp.petition_type\n" +
            "         when '112' then\n" +
            "          'شکواییه'\n" +
            "         when '109' then\n" +
            "          'گزارش ضابط'\n" +
            "         else\n" +
            "          'نا مشخص'\n" +
            "       end as petition_type_title,\n" +
            "       njp.petition_no,\n" +
            "       njp.petition_id,\n" +
            "       njp.jud_org_id,\n" +
            "       beg.external_vahed_name as jud_org_title,\n" +
            "       njp.petition_relief_accusation accusation,\n" +
            "       jcv.title as accusation_title,\n" +
            "       njp.is_final,\n" +
            "       case njp.is_final\n" +
            "         when 0 then\n" +
            "          'ثبت اولیه'\n" +
            "         when 1 then\n" +
            "          'ثبت نهایی'\n" +
            "         else\n" +
            "          'نا مشخص'\n" +
            "       end as is_final_title,\n" +
            "       njp.create_date,\n" +
            "       njp.petition_relief_description as relief_description,\n" +
            "       njp.description as description,\n" +
            "       njp.petition_relief_price as relief_price,\n" +
            "       dbpk_krn_user.get_user_real_name(njp.create_by) || ' ' ||\n" +
            "       dbpk_krn_user.get_user_real_family(njp.create_by) || '/' ||\n" +
            "       dbpk_krn_user.get_user_name(njp.create_by) || '/' ||\n" +
            "       dbpk_krn_user.get_workspace_title(njp.create_by) as create_by\n" +
            "  from news_jud_petition    njp,\n" +
            "       bse_external_ghazaee beg,\n" +
            "       jud_combo_values     jcv\n" +
            " where njp.jud_org_id = beg.code_vahed\n" +
            "   and jcv.code = njp.petition_relief_accusation\n" +
            "   and njp.fk_dossier_id = 16134371\n" +
            " order by njp.petition_id desc\n";
}
