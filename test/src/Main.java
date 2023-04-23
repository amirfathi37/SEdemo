public class Main {
    public static void main(String[] args) {

        new Test().bark("miw");
        new Test2().bark("miw");
        String s = "select pi.firstname,\n" +
                "       pi.lastname,\n" +
                "       pi.father_name,\n" +
                "       pi.national_code,\n" +
                "       pi.identity_number,\n" +
                "       to_char(pi.birth_date, 'DD/MM/YYYY', 'nls_calendar=persian') birth_date,\n" +
                "       dbpk_krn_catalog.Get_spc_Title(pi.fk_sexuality_id) sex_title,\n" +
                "       pi.fk_sexuality_id sex_id,\n" +
                "       'مرد' as ghove_sex_title,\n" +
                "       2 as ghove_sex_id,\n" +
                "       dbpk_krn_catalog.Get_spc_Title(dc.fk_position_person_id) position_title,\n" +
                "       dc.fk_position_person_id position_id,\n" +
                "       'شاکی' as ghove_role_type_title,\n" +
                "       111 as ghove_role_type_id,\n" +
                "       dbpk_krn_catalog.Get_spc_Title(cp.fk_occupation_type_id) occupation_type_title,\n" +
                "       cp.fk_occupation_type_id fk_occupation_type_id,\n" +
                "       'تست' as ghove_job_title,\n" +
                "       '00299' as ghove_job_id,\n" +
                "       a.postal_code,\n" +
                "       dbpk_ghove.Get_base_data_Title(a.ghove_city) ghove_city_title,\n" +
                "       a.ghove_city ghove_city_code,\n" +
                "       a.district,\n" +
                "       a.basic_street,\n" +
                "       dbpk_pub_address.Get_String_Address(a.pk_address_id) home_address,\n" +
                "       pi.pk_person_info_id,\n" +
                "       dbpk_pub_address.Get_mobile(pi.pk_person_info_id) mobile,\n" +
                "       d.dossier_description\n" +
                "\n" +
                "  from tbl_pub_dossier         d,\n" +
                "       tbl_pub_dossier_crime   dc,\n" +
                "       tbl_pub_person_info     pi,\n" +
                "       tbl_pub_complete_person cp,\n" +
                "       tbl_pub_address         a\n" +
                " where d.pk_dossier_id = dc.fk_dossier_id\n" +
                "   and dc.fk_person_info_id = pi.pk_person_info_id\n" +
                "   and pi.pk_person_info_id = cp.pf_person_info_id(+)\n" +
                "   and cp.fk_home_address_id = a.pk_address_id(+)\n" +
                "   and dc.is_primary_record = 3\n" +
                "   and d.pk_dossier_id = 16134310\n";

    }

    static void callBark(TestImpl test){
      //  test.bark();
    }
}
