/**
 * PersonImpl
 *
 * Concrete class.
 */
public class PersonImpl implements Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void thought(How how) {
    }

    @Override
    public void felt(How how) {
    }

    @Override
    public void said(How how) {
    }

    @Override
    public void done(How how) {
    }
}
