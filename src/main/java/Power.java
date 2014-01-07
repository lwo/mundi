/**
 * Power
 * <p/>
 * The capacity to influence each other's behaviour.
 * <p/>
 * The capacity of persons
 * to affect through either inducements or sanctions
 * what is thought, felt, said or done by other persons,
 * subject to that capacity deriving from the possession of institutional, not personal, attributes.
 */
public abstract class Power {

    /**
     * capacity: the extend to affect
     */
    int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * induce
     * <p/>
     * Positive motivator to influence a person
     */
    void induce(Person person, How how) {
        how.positive = true;
        person.thought(how);
        person.felt(how);
        person.said(how);
        person.done(how);
    }

    /**
     * sanction
     * <p/>
     * Negative motivator to influence a person
     */
    void sanction(Person person, How how) {
        how.positive = false;
        person.thought(how);
        person.felt(how);
        person.said(how);
        person.done(how);
    }
}
