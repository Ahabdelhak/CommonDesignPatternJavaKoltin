package com.ah_abdelhak.commondesignpattern.Builder.Java.Example1;

class DomesticPlan extends Plan{
    @Override
    void getRate() {
        rate=3.50;
    }
}//end of DomesticPlan class.
class CommercialPlan extends Plan{
    @Override
    void getRate() {
        rate=7.50;
    }
}//end of CommercialPlan class.
class  InstitutionalPlan extends Plan{
    @Override
    public void getRate(){
        rate=5.50;
    }
}//end of InstitutionalPlan class.
