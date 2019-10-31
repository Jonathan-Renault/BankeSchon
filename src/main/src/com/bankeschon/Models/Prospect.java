package main.src.com.bankeschon.Models;

import java.util.UUID;

public class Prospect {
    public UUID     _id;
    public Boolean  is_customer;
    public String   name;
    public String   surname;
    public String   birthday; // à convertir en datetime
    public String   tel;
    public String   last_contact; // à convertir en timestamp
    public Boolean  can_be_contacted;
    public Integer  number_of_calls;
    public Integer  family_situation; // 0 = celibataire, 1 = marié/pacsé, 2 = divorcé/veuf
    public Integer  professional_situation; // 0 = sans emploi, 1 = employé, 2 = cadre, 3 = fonctionnaire, 4 = indé
    public Integer  professional_contract_type; // 0 = interim, 1 = CDD, 2 = CDI
    public Integer  salary;
    public String   spends; // 3 maximum, séparé par des |
    public String   adapted_offers; // 3 maximum, séparé par des |
    public String   created_at; // à convertir en timestamp
    public String   updated_at; // à convertir en timestamp
}
