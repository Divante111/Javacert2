package mavenproject.apitests;

public class Booking {

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private String additionalneeds;
    private Bookingdates bookingdates;

    
    public Booking(String firstname, String lastname, int totalprice, boolean depositpaid, String additionalneeds,
            Bookingdates bookingdates) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.additionalneeds = additionalneeds;
        this.bookingdates = bookingdates;
    }


    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public int getTotalprice() {
        return totalprice;
    }


    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }


    public boolean isDepositpaid() {
        return depositpaid;
    }


    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }


    public String getAdditionalneeds() {
        return additionalneeds;
    }


    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }


    public Bookingdates getBookingdates() {
        return bookingdates;
    }


    public void setBookingdates(Bookingdates bookingdates) {
        this.bookingdates = bookingdates;
    }


    @Override
    public String toString() {
        return "Booking [firstname=" + firstname + ", lastname=" + lastname + ", totalprice=" + totalprice
                + ", depositpaid=" + depositpaid + ", additionalneeds=" + additionalneeds + ", bookingdates="
                + bookingdates + "]";
    }
    
    
    /*
    '{
    "firstname" : "Jim",
    "lastname" : "Brown",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
     */
}
