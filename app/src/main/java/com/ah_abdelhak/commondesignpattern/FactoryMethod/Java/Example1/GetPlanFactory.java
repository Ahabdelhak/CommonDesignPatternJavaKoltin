package com.ah_abdelhak.commondesignpattern.FactoryMethod.Java.Example1;

class GetPlanFactory{
    //use getPlan method to get object of type Plan
    /**
     * @param planType
     * @return Plan
     */
    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}