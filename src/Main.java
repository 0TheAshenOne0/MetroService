Metro london = new Metro(5, "TheTube", true);

void main() {
    if (Metro.late()) {
        london.availability = false;
    }
    london.processBooking();

}