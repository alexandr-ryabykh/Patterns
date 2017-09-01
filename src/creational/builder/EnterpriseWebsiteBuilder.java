package creational.builder;

class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.JOOMLA);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
