package designpattern.template_method_caffeine;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("필터로 커피 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 커피 추가하는 중");
    }
}
