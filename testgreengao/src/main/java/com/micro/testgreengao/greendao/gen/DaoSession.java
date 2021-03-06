package com.micro.testgreengao.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.micro.testgreengao.bean.Note;
import com.micro.testgreengao.bean.one2many1.Customer;
import com.micro.testgreengao.bean.one2many1.Order;
import com.micro.testgreengao.bean.one2many2.Company;
import com.micro.testgreengao.bean.one2many2.SuccessfulMan;
import com.micro.testgreengao.bean.one2many3.Book;
import com.micro.testgreengao.bean.one2many3.City;
import com.micro.testgreengao.bean.one2many3.CityAndBooks;
import com.micro.testgreengao.bean.one2one.IdCard;
import com.micro.testgreengao.bean.one2one.Person;
import com.micro.testgreengao.bean.User;

import com.micro.testgreengao.greendao.gen.NoteDao;
import com.micro.testgreengao.greendao.gen.CustomerDao;
import com.micro.testgreengao.greendao.gen.OrderDao;
import com.micro.testgreengao.greendao.gen.CompanyDao;
import com.micro.testgreengao.greendao.gen.SuccessfulManDao;
import com.micro.testgreengao.greendao.gen.BookDao;
import com.micro.testgreengao.greendao.gen.CityDao;
import com.micro.testgreengao.greendao.gen.CityAndBooksDao;
import com.micro.testgreengao.greendao.gen.IdCardDao;
import com.micro.testgreengao.greendao.gen.PersonDao;
import com.micro.testgreengao.greendao.gen.UserDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig noteDaoConfig;
    private final DaoConfig customerDaoConfig;
    private final DaoConfig orderDaoConfig;
    private final DaoConfig companyDaoConfig;
    private final DaoConfig successfulManDaoConfig;
    private final DaoConfig bookDaoConfig;
    private final DaoConfig cityDaoConfig;
    private final DaoConfig cityAndBooksDaoConfig;
    private final DaoConfig idCardDaoConfig;
    private final DaoConfig personDaoConfig;
    private final DaoConfig userDaoConfig;

    private final NoteDao noteDao;
    private final CustomerDao customerDao;
    private final OrderDao orderDao;
    private final CompanyDao companyDao;
    private final SuccessfulManDao successfulManDao;
    private final BookDao bookDao;
    private final CityDao cityDao;
    private final CityAndBooksDao cityAndBooksDao;
    private final IdCardDao idCardDao;
    private final PersonDao personDao;
    private final UserDao userDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        noteDaoConfig = daoConfigMap.get(NoteDao.class).clone();
        noteDaoConfig.initIdentityScope(type);

        customerDaoConfig = daoConfigMap.get(CustomerDao.class).clone();
        customerDaoConfig.initIdentityScope(type);

        orderDaoConfig = daoConfigMap.get(OrderDao.class).clone();
        orderDaoConfig.initIdentityScope(type);

        companyDaoConfig = daoConfigMap.get(CompanyDao.class).clone();
        companyDaoConfig.initIdentityScope(type);

        successfulManDaoConfig = daoConfigMap.get(SuccessfulManDao.class).clone();
        successfulManDaoConfig.initIdentityScope(type);

        bookDaoConfig = daoConfigMap.get(BookDao.class).clone();
        bookDaoConfig.initIdentityScope(type);

        cityDaoConfig = daoConfigMap.get(CityDao.class).clone();
        cityDaoConfig.initIdentityScope(type);

        cityAndBooksDaoConfig = daoConfigMap.get(CityAndBooksDao.class).clone();
        cityAndBooksDaoConfig.initIdentityScope(type);

        idCardDaoConfig = daoConfigMap.get(IdCardDao.class).clone();
        idCardDaoConfig.initIdentityScope(type);

        personDaoConfig = daoConfigMap.get(PersonDao.class).clone();
        personDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        noteDao = new NoteDao(noteDaoConfig, this);
        customerDao = new CustomerDao(customerDaoConfig, this);
        orderDao = new OrderDao(orderDaoConfig, this);
        companyDao = new CompanyDao(companyDaoConfig, this);
        successfulManDao = new SuccessfulManDao(successfulManDaoConfig, this);
        bookDao = new BookDao(bookDaoConfig, this);
        cityDao = new CityDao(cityDaoConfig, this);
        cityAndBooksDao = new CityAndBooksDao(cityAndBooksDaoConfig, this);
        idCardDao = new IdCardDao(idCardDaoConfig, this);
        personDao = new PersonDao(personDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);

        registerDao(Note.class, noteDao);
        registerDao(Customer.class, customerDao);
        registerDao(Order.class, orderDao);
        registerDao(Company.class, companyDao);
        registerDao(SuccessfulMan.class, successfulManDao);
        registerDao(Book.class, bookDao);
        registerDao(City.class, cityDao);
        registerDao(CityAndBooks.class, cityAndBooksDao);
        registerDao(IdCard.class, idCardDao);
        registerDao(Person.class, personDao);
        registerDao(User.class, userDao);
    }
    
    public void clear() {
        noteDaoConfig.clearIdentityScope();
        customerDaoConfig.clearIdentityScope();
        orderDaoConfig.clearIdentityScope();
        companyDaoConfig.clearIdentityScope();
        successfulManDaoConfig.clearIdentityScope();
        bookDaoConfig.clearIdentityScope();
        cityDaoConfig.clearIdentityScope();
        cityAndBooksDaoConfig.clearIdentityScope();
        idCardDaoConfig.clearIdentityScope();
        personDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
    }

    public NoteDao getNoteDao() {
        return noteDao;
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public OrderDao getOrderDao() {
        return orderDao;
    }

    public CompanyDao getCompanyDao() {
        return companyDao;
    }

    public SuccessfulManDao getSuccessfulManDao() {
        return successfulManDao;
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public CityDao getCityDao() {
        return cityDao;
    }

    public CityAndBooksDao getCityAndBooksDao() {
        return cityAndBooksDao;
    }

    public IdCardDao getIdCardDao() {
        return idCardDao;
    }

    public PersonDao getPersonDao() {
        return personDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

}
