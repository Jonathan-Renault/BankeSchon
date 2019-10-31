package main.src.com.bankeschon.Models;

import java.util.UUID;

public class Prospect {
    private String tableName = "prospects";

    public UUID     _id;
    private Boolean  is_customer;
    private String   name;
    private String   surname;
    private String   birthday; // à convertir en datetime
    private String   tel;
    private String   last_contact; // à convertir en timestamp
    private Boolean  can_be_contacted;
    private Integer  number_of_calls;
    private Integer  family_situation; // 0 = celibataire, 1 = marié/pacsé, 2 = divorcé/veuf
    private Integer  professional_situation; // 0 = sans emploi, 1 = employé, 2 = cadre, 3 = fonctionnaire, 4 = indé
    private Integer  professional_contract_type; // 0 = interim, 1 = CDD, 2 = CDI
    private Integer  salary;
    private String   spends; // 3 maximum, séparé par des |
    private String   adapted_offers; // 3 maximum, séparé par des |
    public String   created_at; // à convertir en timestamp
    public String   updated_at; // à convertir en timestamp
}
