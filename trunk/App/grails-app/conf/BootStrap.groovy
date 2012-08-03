import com.jabait.security.User
import com.jabait.hrm.Organization
import com.jabait.hrm.Department
import com.jabait.hrm.calendar.CalendarType
import com.jabait.hrm.JobTitle
import com.jabait.hrm.calendar.CalendarSetting
import com.jabait.hrm.calendar.CalendarShare
import com.jabait.security.Feature
import com.jabait.accounting.AccountHead
import com.jabait.accounting.Accounts
import com.jabait.scm.inventory.ProductClassification
import com.jabait.util.UnitOfMeasure
import com.jabait.scm.inventory.ProductType

class BootStrap {

    def init = { servletContext ->

        User.initialize();
        Feature.initialize();
        Organization.initialize();
        Department.initialize();
        CalendarType.initialize();
        JobTitle.initialize();
        CalendarSetting.initialize();
        CalendarShare.initialize();
        AccountHead.initialize();
        Accounts.initialize();
        ProductClassification.initialize();
        UnitOfMeasure.initialize();
        ProductType.initialize();

    }
    def destroy = {
    }
}