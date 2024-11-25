package lab_4.override.перваячасть;

public class Whale extends Cow {


    @Override
    public String getName() {
        return "Я не " + super.getName() + ", Я - кит";
    }
}
