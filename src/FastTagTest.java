import model.FastTagIdDetails;

public class FastTagTest {
    public static void main(String[] args) {
        HighwayFastTag highwayFastTag = new HighwayFastTag();
        highwayFastTag.payment();
        ORRFastTag orrFastTag = new ORRFastTag();
        orrFastTag.payment();

    }
}
