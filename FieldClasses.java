
abstract class CareerField{
    public abstract String field();
    public abstract String recommendationCourse();
    public abstract String jobOpportunities();
    public abstract String otherInfo();
}

//0
class LawField extends CareerField{
    public String field(){
        return "Recommend Law and Legal Services!\n" +
        "Includes lawyers, judges, paralegals, \nand legal consultants.\n";
    }
    public String recommendationCourse(){
        return "Bachelor of Laws (LLB)\n" +
        "Bachelor of Arts in Political Science (AB PolSci)\n" +
        "Bachelor of Arts in Legal Management (LM)\n" +
        "Bachelor of Public Administration (BPA)\n" +
        "Bachelor of Science in Criminology (BS Crim)\n" +
        "Bachelor of Arts in Philosophy (AB Philosophy)\n";
    }
    public String jobOpportunities(){
        return "Legal Officer\n" +
        "Corporate Lawyer\n" +
        "Litigation Lawyer\n" +
        "Paralegal\n" +
        "Immigration Lawyer\n" +
        "HR Legal Consultant\n" +
        "Tax Lawyer\n" +
        "Law Professor\n" +
        "Public Attorney\n" +
        "Prosecutor\n";

    }
    public String otherInfo(){
        return "Monthly salary of Law and Legal Services averaging 48,000 PHP ";
    }
}

//1
class TradesAndCraftsField extends CareerField{
    public String field(){
        return "Recommend Trades and Crafts!\n" +
        " Includes skilled labor roles like carpentry, \nplumbing, electrical work, and auto repair.\n";
    }
    public String recommendationCourse(){
        return "Bachelor of Science in Industrial Technology (BSIT)\n" +
        "Bachelor of Science in Technical Education\n" +
        "Bachelor of Science in Hospitality Management (BSHM)\n" +
        "Bachelor of Science in Agriculture (BS Agriculture)\n" +
        "Bachelor of Science in Agricultural Engineering (BSAE)\n" +
        "Bachelor of Science in Construction Technology (BSCT)\n" +
        "Courses in Technical Education and Skills Development Authority (TESDA)\n";
    }
    public String jobOpportunities(){
        return "Carpenter\n" +
        "Welder\n" +
        "Cabinetmaker\n" +
        "Plumber\n" +
        "Mason\n" +
        "Electrician\n" +
        "Laborer\n";

    }
    public String otherInfo(){
        return "Construction jobs get around 308,000 PHP in salary yearly.";
    }
}

//2
class PublicServiceField extends CareerField{
    public String field(){
        return "Recommend Public Service!\n" +
        "Focuses on roles in government, law enforcement, \nmilitary, and social work that serve the public.\n";
    }
    public String recommendationCourse(){
        return "Bachelor of Public Administration (BPA)\n" +
        "Bachelor of Science in Business Administration (BSBA)\n" +
        "Bachelor of Arts in Social Work (BASW)\n" +
        "Bachelor of Science in Public Safety (BSPS)\n" +
        "Bachelor of Science in Criminology (BS Crim)\n" +
        "Bachelor of Science in Management (BSM)\n" +
        "Bachelor of Science in Marketing (BSMktg)\n" +
        "Bachelor of Arts in Political Science (AB PolSci)\n";
    }
    public String jobOpportunities(){
        return "Teacher\n" +
        "Election Officer\n" +
        "Administrative Officer\n" +
        "Administrative Aide\n" +
        "Traffic Aide\n" +
        "Security Guard\n" +
        "Statistician\n" +
        "Laborer\n" +
        "Utility Worker\n";
    }
    public String otherInfo(){
        return "Monthly Salary of roughly 15,000 to 38,000 PHP in Public Service.";
    }
}

//3
class HospitalityField extends CareerField{
    public String field(){
        return "Recommend Hospitality and Tourism!\n" +
        "Covers roles in event planning, hotel management, \ntour guides, and food services.\n";
    }
    public String recommendationCourse(){
        return "Bachelor of Science in Hospitality Management (BSHM)\n" +
        "Bachelor of Science in Tourism Management (BSTM)\n" +
        "Bachelor of Science in Hospitality Management specialized in Cruise Line Operations Culinary Arts (BSHM-CLOCA)\n" +
        "BSHM specialized in Cruise Line Operations in Hotel Services (BSHM-CLOHS)\n" +
        "BSHM specialized in Culinary Arts and Kitchen Operations (BSHM-CAKO)\n" +
        "BSHM specialized in Hotel and Restaurant Administration (BSHM-HRA)\n";
    }
    public String jobOpportunities(){
        return "Travel Agent\n" +
        "Customer Service Agent\n" +
        "Waiter\n" +
        "Service Crew\n" +
        "Hotel Room Attendant\n" +
        "Housekeeper\n" +
        "Receptionist\n";

    }
    public String otherInfo(){
        return "A Travel Agent's Monthly Salary is about 24,000 PHP.";
    }
}

//4
class BusinessCommerceField extends CareerField{
    public String field(){
        return "Recommend Business/Commerce!\n" +
        "Includes roles in finance, marketing, management, \nentrepreneurship, and sales.\n";
    }
    public String recommendationCourse(){
        return "Bachelor of Science in Business Administration (BSBA)\n" +
        "Bachelor of Science in Commerce (BCom)\n" +
        "Bachelor of Science in Entrepreneurship (BSEntrep)\n" +
        "Bachelor of Science in Accountancy (BSA)\n" +
        "Bachelor of Science in Management (BSM)\n" +
        "Bachelor of Science in Marketing (BSMktg)\n" +
        "Bachelor of Science in Finance (BSFin)\n" +
        "Bachelor of Science in International Business (BSIB)\n" +
        "Bachelor of Science in E-Commerce (BSECom)\n" +
        "Bachelor of Science in Real Estate Management (BSREM)\n";
    }
    public String jobOpportunities(){
        return "Marketing Manager\n" +
        "Financial Analyst\n" +
        "Business Intelligence Analyst \n" +
        "Business Operations Manager\n" +
        "Salesperson\n" +
        "Project Manager\n" +
        "Management Consultant\n" +
        "Human Resources Manager\n";
    }
    public String otherInfo(){
        return "Average Annual Salaries go from 90,000 USD to 135,000 USD in Business Jobs.";
    }
}

//5
class EducationField extends CareerField{
    public String field(){
        return "Recommend Education!\n" +
        "Involves teaching, training, academic research, \nand educational management.\n";
    }
    public String recommendationCourse(){
        return "Bachelor of Elementary Education (BEEd)\n" +
        "Bachelor of Secondary Education (BSEd)\n" +
        "Bachelor of Early Childhood Education (BECEd)\n" +
        "Bachelor of Physical Education (BPEd)\n" +
        "Bachelor of Special Needs Education (BSNEd)\n";
    }
    public String jobOpportunities(){
        return "Elementary School Teacher\n" +
        "Secondary School Teacher\n" +
        "Special Education (SPED) Teacher\n" +
        "Physical Education (PE) Teacher\n" +
        "School Administrator\n" +
        "Guidance Counselor\n" +
        "Education Consultant\n" +
        "Teacher Trainer\n";

    }
    public String otherInfo(){
        return "Teacher salaries typically range from ₱21,000 to ₱34,000 per month. The \naverage monthly salary for a teacher is around ₱27,000.";
    }
}

//6
class MediaAndCommunicationField extends CareerField{
    public String field(){
        return "Recommend Media and Communications!\n" +
        "Encompasses journalism, public relations, \ncontent creation, and broadcasting.\n";
    }
    public String recommendationCourse(){
        return "Bachelor of Arts in Communication (AB Communication)\n" +
        "Bachelor of Arts in Journalism (AB Journalism)\n" +
        "Bachelor of Arts in Broadcast Communication (AB Broadcast Communication)\n" +
        "Bachelor of Arts in Multimedia Arts (AB Multimedia Arts)\n" +
        "Bachelor of Arts in Development Communication (AB DevCom)\n" +
        "Bachelor of Arts in Film and Media Studies (AB Film and Media Studies)\n" +
        "Bachelor of Arts in Advertising and Public Relations (AB Advertising and PR)\n" +
        "Bachelor of Science in Digital Media Technology (BS Digital Media Technology)\n" +
        "Bachelor of Arts in Media and Communication (AB Media and Communication)\n";
    }
    public String jobOpportunities(){
        return "General Manager\n" +
        "Director\n" +
        "Production Manager\n" +
        "Operator\n" +
        "Writer\n" +
        "Media Specialist\n";
    }
    public String otherInfo(){
        return "Annual salary of roughly 360,000 - 600,000 Php for Media and Communication Jobs.";
    }
}

//7
class ScienceAndResearchField extends CareerField{
    public String field(){
        return "Recommend Science and Technology!\n" +
        "Includes roles in research, laboratory work, and \ntechnology in various fields like \nbiology, physics, and computer science.\n";
    }
    public String recommendationCourse(){
        return "Bachelor of Science in Biology (BS Biology)\n" +
        "Bachelor of Science in Chemistry (BS Chemistry)\n" +
        "Bachelor of Science in Physics (BS Physics)\n" +
        "Bachelor of Science in Environmental Science (BS Environmental Science)\n" +
        "Bachelor of Science in Marine Biology (BSMB)\n" +
        "Bachelor of Science in Geology (BS Geology)\n" +
        "Bachelor of Science in Meteorology\n" +
        "Bachelor of Science in Biochemistry (BS Biochemistry)\n" +
        "Bachelor of Science in Food Technology (BSFT)\n" +
        "Bachelor of Science in Math (BS Math)\n" +
        "Bachelor of Science in Statistics (BS Stat)\n" +
        "Bachelor of Science in Computer Science (BSCS)\n" +
        "Bachelor of Science in Information Technology (BSIT)\n" +
        "Bachelor of Science in Information System (BSIS)\n" +
        "Bachelor of Science in Data Science (BSDS)\n";


    }
    public String jobOpportunities(){
        return "Research Scientist\n" +
        "Research Specialist\n" +
        "Research Assistant\n" +
        "Food Scientist\n" +
        "Geologist\n" +
        "Chemist\n" +
        "Biologist\n" +
        "Software Engineer\n" +
        "Computer Programmer\n" +
        "Information Security Analyst" +
        "Web Developer\n" +
        "IT Support Specialist\n";

    }
    public String otherInfo(){
        return "Monthly Salaries start from 22,000 PHP for Junior Researchers, and 25,000 PHP for Software Developer.";
    }
}

//8
class NonprofitField extends CareerField{
    public String field(){
        return "Recommend Nonprofit and Community Development!\n" +
        "Focuses on roles in charitable organizations, \nsocial advocacy, and community services\n";
    }
    public String recommendationCourse(){
        return "Bachelor of Science in Community Development (BSCD)\n" +
        "Bachelor of Arts in Social Work (BASW)\n" +
        "Bachelor of Science in Public Administration (BSPA)\n" +
        "Bachelor of Science in Development Communication (BSDC)\n" +
        "Bachelor of Science in Social Entrepreneurship (BSSE)\n" +
        "Bachelor of Science in Nonprofit Management (BSNM)\n" +
        "Bachelor of Science in Human Services (BSHS)\n" +
        "Bachelor of Science in Urban and Regional Planning (BSURP)\n" +
        "Bachelor of Science in Environmental Science (BSES)\n" +
        "Bachelor of Science in Public Health (BSPH)\n";
    }
    public String jobOpportunities(){
        return "Program Manager\n" +
        "Project Coordinator\n" +
        "Social Worker\n" +
        "Humanitarian Aid Worker\n" +
        "Relief Coordinator\n" +
        "Fundraising Manager\n" +
        "Nonprofit Educator\n";

    }
    public String otherInfo(){
        return "Nonprofit salaries average 67,000 USD yearly, and can range from \n43,000 USD from Program Coordinators to 141,000 USD from CEOs.";
    }
}

//9
class HealthcareField extends CareerField{
    public String field(){
        return "Recommend Healthcare!\n" +
        "Covers roles in medical care, including doctors, nurses, \npharmacists, and public health workers.\n";
    }
    public String recommendationCourse(){
        return "Bachelor of Medicine, Bachelor of Surgery [MBBS]\n" +
            "Bachelor of Pharmacy or BPharm\n" +
            "Bachelor of Physiotherapy [BPT]\n" +
            "Bachelor of Ayurvedic Medicine and Surgery [BAMS]\n" +
            "Bachelor of Unani Medicine & Surgery\n" +
            "Bachelor of Dental Surgery (BDS)\n" +
            "Bachelor of Science in Nursing (BSc Nursing)\n" +
            "Bachelor of Homeopathic Medicine & Surgery [BHMS]\n" +
            "Bachelor of Occupational Therapy [BOT]\n" +
            "Bachelor in Audiology and Speech-Language Pathology [BASLP]\n" +
            "Bachelor of Science in Radiography and Medical Imaging\n" +
            "Bachelor of Science [B.Sc] (Industrial Microbiology)\n" +
            "Bachelor of Optometry [B.Optom]\n" +
            "Bachelor of Veterinary Science\n" +
            "Bachelor of Science in Medical Technology (BS Medical Technology)\n" +
            "Bachelor of Science in Public Health (BS Public Health)\n" +
            "Bachelor of Science in Biology (BS Biology)\n" +
            "Bachelor of Science in Psychology (BS Psychology)\n" +
            "Bachelor of Science in Health Science Education (BS Health Science Education)\n" +
            "Bachelor of Science in Hospital Management (BS Hospital Management)\n" +
            "Doctor of Dental Medicine (DMD)\n" +
            "Doctor of Veterinary Medicine (DVM)\n" +
            "Emergency Medical Technician (EMT)\n";

    }
    public String jobOpportunities(){
        return "Specialist Medical Practitioner\n" +
        "Medical Doctor / General Medical Practitioner\n" +
        "Dentist\n" +
        "Nursing Professional\n" +
        "Medical Imaging and Therapeutic Equipment Technnician\n" +
        "Physiotherapist or Physical Therapist\n" +
        "Medical Technologist\n" +
        "Pharmacist\n" +
        "Dietician and Nutritionist\n" +
        "Accounting and Bookkeeping Clerk\n" +
        "Midwifery Professional\n" +
        "Healthcare Assistant\n";
    }
    public String otherInfo(){
        return "Monthly salary of roughly 15,000-57,000 Php for Healthcare Jobs.\n";
    }
}

//10
class EngiAndArchiField extends CareerField{
    public String field(){
        return "Recommend Engineering and Architecture!\n" +
        "Covers technical fields like civil, mechanical, \nelectrical engineering, and architecture design.\n";
    }
    public String recommendationCourse(){
        return "Engineering:\n" +
        "Bachelor of Science in Civil Engineering (BSCE)\n" +
        "Bachelor of Science in Mechanical Engineering (BSME)\n" +
        "Bachelor of Science in Electrical Engineering (BSEE)\n" +
        "Bachelor of Science in Electronics Engineering (BSECE)\n" +
        "Bachelor of Science in Computer Engineering (BSCpE)\n" +
        "Bachelor of Science in Chemical Engineering (BSChE)\n" +
        "Bachelor of Science in Industrial Engineering (BSIE)\n" +
        "Bachelor of Science in Environmental Engineering (BSEnvE)\n" +
        "Bachelor of Science in Materials Engineering (BSMatE)\n" +
        "Bachelor of Science in Aerospace Engineering (BSAE)\n" +
        "Bachelor of Science in Biomedical Engineering (BSBME)\n" +
        "Bachelor of Science in Mining Engineering (BSMinE)\n" +
        "Bachelor of Science in Petroleum Engineering (BSPetE)\n" +
        "Bachelor of Science in Agricultural Engineering (BSAE)\n" +
        "Bachelor of Science in Geodetic Engineering (BSGE)\n" +
        "\nArchitecture:\n" +
        "Bachelor of Science in Architecture (BSArch)\n" +
        "Bachelor of Landscape Architecture (BLA)\n" +
        "Bachelor of Interior Design (BID)\n" +
        "Bachelor of Science in Urban Planning (BSUP)\n" +
        "Bachelor of Science in Environmental Design (BSED)\n";
    }
    public String jobOpportunities(){
        return "Architect\n" +
        "Project Architect\n" +
        "Civil Engineer\n" +
        "Mechanical Engineer\n" +
        "Electrical Engineer\n" +
        "Structural Engineer\n" +
        "Urban Planner\n" +
        "Design Engineer\n" +
        "Project Engineer\n" +
        "Safety Engineer\n" +
        "BIM Modeler\n" +
        "Environmental Engineer\n";

    }
    public String otherInfo(){
        return "The average annual salary for architects and engineers is ₱420,000. \nEntry-level positions start at ₱324,000 for architects \nand ₱331,632 for engineers, while senior positions can earn \nup to ₱720,000 for architects and ₱780,000 for engineers.";
    }
}

//11
class LogisticsField extends CareerField{
    public String field(){
        return "Recommend Logistics and Transportation!\n" +
        "Encompasses roles in supply chain management, \nshipping, and public transportation systems.\n";
    }
    public String recommendationCourse(){
        return "Bachelor of Science in Logistics and Supply Chain Management (BSLSCM)\n" +
        "Bachelor in Transportation Management (BTM)\n" +
        "Bachelor of Science in Maritime Transportation (BSMT)\n" +
        "Bachelor of Science in Customs Administration (BSCA)\n" +
        "Bachelor of Science in Aviation Logistics (BSAL)\n" +
        "Bachelor of Science in Transport and Logistics (BSTL)\n" +
        "Bachelor of Science in Shipping Management (BSSM)\n" +
        "Bachelor of Science in Port Management (BSPM)\n" +
        "Bachelor of Science in Freight Forwarding (BSFF)\n" +
        "Bachelor of Science in Supply Chain and Operations Management (BSSCOM)\n";
    }
    public String jobOpportunities(){
        return "Logistics Manager\n" +
        "Delivery Driver\n" +
        "Operations Manager\n" +
        "Forklift Operator\n" +
        "Purchasing Manager\n" +
        "Coordinator\n" +
        "Courier\n";

    }
    public String otherInfo(){
        return "Logistics jobs get around 375,000 PHP in salary yearly.";
    }
}
