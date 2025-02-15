package com.xworkz.project1;

import com.xworkz.project1.bean.*;
import com.xworkz.project1.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Table table = applicationContext.getBean(Table.class);
//        table.setId(1);
//        table.setBrandName("Standard");
//        table.setPrice(40000.00);
        System.out.println(table);

        System.out.println("/////////////////////////////////////////////////////////////////");

        Bus bus=applicationContext.getBean(Bus.class);
//        bus.setId(1);
//        bus.setBusName("Ashok Leyland");
//        bus.setBusCapacity(80);
        System.out.println(bus);

        System.out.println("/////////////////////////////////////////////////////////////////");

        School school=applicationContext.getBean(School.class);
//        school.setId(1);
//        school.setSchoolName("Standard School");
//        school.setLocation("OOrgaumpet");
        System.out.println(school);

        System.out.println("/////////////////////////////////////////////////////////////////");

        Factory factory=applicationContext.getBean(Factory.class);
//        factory.setId(1);
//        factory.setOwnerName("Ratan TATA");
//        factory.setFactoryType("Steel Industries");
        System.out.println(factory);

        System.out.println("/////////////////////////////////////////////////////////////////");

        Apps apps=applicationContext.getBean(Apps.class);
//        apps.setAppId(1);
//        apps.setAppName("Zomato");
//        apps.setAppType("Food Delivery");
          System.out.println(apps);
        System.out.println("/////////////////////////////////////////////////////////////////");


        User user = applicationContext.getBean(User.class);
//        user.setUserId(101);
//        user.setUsername("somashekar");
//        user.setEmail("somashekargnaragund@gmail.com");
        System.out.println(user);
        System.out.println("/////////////////////////////////////////////////////////////////");


        Product product = applicationContext.getBean(Product.class);
//        product.setProductId(201);
//        product.setProductName("Laptop");
//        product.setPrice(799.99);
        System.out.println(product);
        System.out.println("/////////////////////////////////////////////////////////////////");


        Order order = applicationContext.getBean(Order.class);
//        order.setOrderId(301);
//        order.setUserId(101);
//        order.setTotalAmount(150.75);
        System.out.println(order);
        System.out.println("/////////////////////////////////////////////////////////////////");


        Customer customer = applicationContext.getBean(Customer.class);
//        customer.setCustomerId(401);
//        customer.setCustomerName("anu");
//        customer.setContactNumber("987654308");
        System.out.println(customer);
        System.out.println("/////////////////////////////////////////////////////////////////");


        Employee employee = applicationContext.getBean(Employee.class);
//        employee.setEmployeeId(501);
//        employee.setEmployeeName("Omkar");
//        employee.setDepartment("Developer");
        System.out.println(employee);
        System.out.println("/////////////////////////////////////////////////////////////////");


        Book book = applicationContext.getBean(Book.class);
//        book.setBookId(601);
//        book.setTitle("Rich dad poor dad");
//        book.setAuthor("Robert Kiyosaki");
        System.out.println(book);
        System.out.println("/////////////////////////////////////////////////////////////////");


        Cars24 car = applicationContext.getBean(Cars24.class);
//        car.setCarId(701);
//        car.setModel("Harrier zx");
//        car.setBrand("TATA");
        System.out.println(car);
        System.out.println("/////////////////////////////////////////////////////////////////");


        Student student = applicationContext.getBean(Student.class);
//        student.setStudentId(801);
//        student.setName("Chetana Angadi");
//        student.setCourse("MBA");
        System.out.println(student);
        System.out.println("/////////////////////////////////////////////////////////////////");


        Teacher teacher = applicationContext.getBean(Teacher.class);
//        teacher.setTeacherId(901);
//        teacher.setName("Anushaka Sharama");
//        teacher.setSubject("Pshyology");
        System.out.println(teacher);
        System.out.println("/////////////////////////////////////////////////////////////////");


        Laptop laptop = applicationContext.getBean(Laptop.class);
//        laptop.setLaptopId(1001);
//        laptop.setBrand("Asus");
//        laptop.setPrice(125000.00);
        System.out.println(laptop);
        System.out.println("/////////////////////////////////////////////////////////////////");


        Movie movie = applicationContext.getBean(Movie.class);
//        movie.setMovieId(1101);
//        movie.setTitle("kill");
//        movie.setGenre("crime");
        System.out.println(movie);
        System.out.println("/////////////////////////////////////////////////////////////////");


        Flight flight = applicationContext.getBean(Flight.class);
//        flight.setFlightId(1201);
//        flight.setAirline("indigo");
//        flight.setDestination("India");
        System.out.println(flight);
        System.out.println("/////////////////////////////////////////////////////////////////");


        Hotel hotel = applicationContext.getBean(Hotel.class);
//        hotel.setHotelId(1301);
//        hotel.setHotelName("Raddison");
//        hotel.setRating(5);
        System.out.println(hotel);
        System.out.println("/////////////////////////////////////////////////////////////////");


        BankAccount bankAccount = applicationContext.getBean(BankAccount.class);
//        bankAccount.setAccountId(1401);
//        bankAccount.setAccountHolder("Somashekar");
//        bankAccount.setBalance(5000000.75);
        System.out.println(bankAccount);
        System.out.println("/////////////////////////////////////////////////////////////////");


        Transaction transaction = applicationContext.getBean(Transaction.class);
//        transaction.setTransactionId(1501);
//        transaction.setAmount(25000.00);
//        transaction.setTransactionType("Credit");
        System.out.println(transaction);
        System.out.println("/////////////////////////////////////////////////////////////////");


        Invoice invoice = applicationContext.getBean(Invoice.class);
//        invoice.setInvoiceId(40);
//        invoice.setAmount(6000.00);
//        invoice.setStatus("Paid");
        System.out.println(invoice);
        System.out.println("/////////////////////////////////////////////////////////////////");


        MusicAlbum musicAlbum = applicationContext.getBean(MusicAlbum.class);
//        musicAlbum.setAlbumId(10);
//        musicAlbum.setAlbumName("Thriller");
//        musicAlbum.setArtist("Michael Jackson");
        System.out.println(musicAlbum);
        System.out.println("/////////////////////////////////////////////////////////////////");


        ShoppingCart shoppingCart = applicationContext.getBean(ShoppingCart.class);
//        shoppingCart.setCartId(10001);
//        shoppingCart.setUserId(11);
//        shoppingCart.setTotalItems(5);
        System.out.println(shoppingCart);
        System.out.println("/////////////////////////////////////////////////////////////////");


        Subscription subscription = applicationContext.getBean(Subscription.class);
//        subscription.setSubscriptionId(1000);
//        subscription.setPlanName("Netflix Premium");
//        subscription.setMonthlyCost(799.99);
        System.out.println(subscription);
        System.out.println("/////////////////////////////////////////////////////////////////");

        Fish fish= applicationContext.getBean(Fish.class);
        System.out.println(fish);

    }
}
