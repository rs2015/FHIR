(window.webpackJsonp=window.webpackJsonp||[]).push([[14,17],{"013z":function(e,t,a){"use strict";a("HQhv"),a("sC2a");var n=a("qKvR"),r=a("pOBw"),i=a("q1tI"),l=a.n(i),b=a("huSw"),c=a("t0dz"),o=a.n(c),s=a("Bfmn"),p=a("a7k6"),d=a("TSYQ"),m=a.n(d),u=a("QH2O"),h=function(e){var t,a=e.children,r=e.title,i=e.tabs,l=void 0===i?[]:i,b=e.shouldHideHeader;return Object(n.b)("div",{className:m()((t={},t[u.pageHeader]=u.pageHeader,t[u.pageHeaderSticky]=l.length,t[u.pageHeaderShifted]=b,t))},Object(n.b)("div",{className:"bx--grid"},Object(n.b)("div",{className:"bx--row"},Object(n.b)("div",{className:"bx--col-lg-12"},Object(n.b)("h1",{id:"page-title",className:u.text},r)))),a)},j=a("Z3H1"),O=a("BAC9"),N=function(e){var t=e.relativePagePath,a=e.repository,r=j.data.site.siteMetadata.repository,i=a||r,l=i.baseUrl,b=l+"/tree/master"+i.subDirectory+"/src/pages"+t;return l?Object(n.b)("div",{className:"bx--row "+O.row},Object(n.b)("div",{className:"bx--col"},Object(n.b)("a",{className:O.link,href:b},"Edit this page on GitHub"))):null},f=a("FCXl"),g=a("Wbzz"),y=a("I8xM");var v=function(e){var t,a;function r(){return e.apply(this,arguments)||this}return a=e,(t=r).prototype=Object.create(a.prototype),t.prototype.constructor=t,t.__proto__=a,r.prototype.render=function(){var e=this.props,t=e.tabs,a=e.slug,r=a.split("/").filter(Boolean).slice(-1)[0],i=t.map((function(e){var t,i=o()(e,{lower:!0}),l=i===r,b=a.replace(r,i);return Object(n.b)("li",{key:e,className:m()((t={},t[y.selectedItem]=l,t),y.listItem)},Object(n.b)(g.Link,{className:y.link,to:""+b},e))}));return Object(n.b)("div",{className:y.tabsContainer},Object(n.b)("div",{className:"bx--grid"},Object(n.b)("div",{className:"bx--row"},Object(n.b)("div",{className:"bx--col-lg-12 bx--col-no-gutter"},Object(n.b)("nav",null,Object(n.b)("ul",{className:y.list},i))))))},r}(l.a.Component),I=a("MjG9");t.a=function(e){var t=e.pageContext,a=e.children,i=e.location,l=t.frontmatter,c=void 0===l?{}:l,d=t.relativePagePath,m=c.tabs,u=c.title,j=Object(s.c)(),O=!!m&&"down"===j,g=r.data.site.pathPrefix,y=g?i.pathname.replace(g,""):i.pathname,C=m?y.split("/").slice(-1)[0]||o()(m[0],{lower:!0}):"";return Object(n.b)(p.a,{shouldHideHeader:O,homepage:!1},Object(n.b)(h,{shouldHideHeader:O,title:u,label:"label",tabs:m},m&&Object(n.b)(v,{slug:y,tabs:m,currentTab:C})),Object(n.b)(I.a,{padded:!0},a,Object(n.b)(N,{relativePagePath:d})),Object(n.b)(f.a,{pageContext:t,location:i,slug:y,tabs:m,currentTab:C}),Object(n.b)(b.a,null))}},BAC9:function(e,t,a){e.exports={bxTextTruncateEnd:"EditLink-module--bx--text-truncate--end--2pqje",bxTextTruncateFront:"EditLink-module--bx--text-truncate--front--3_lIE",link:"EditLink-module--link--1qzW3",row:"EditLink-module--row--1B9Gk"}},I8xM:function(e,t,a){e.exports={bxTextTruncateEnd:"PageTabs-module--bx--text-truncate--end--267NA",bxTextTruncateFront:"PageTabs-module--bx--text-truncate--front--3xEQF",tabsContainer:"PageTabs-module--tabs-container--8N4k0",list:"PageTabs-module--list--3eFQc",listItem:"PageTabs-module--list-item--nUmtD",link:"PageTabs-module--link--1mDJ1",selectedItem:"PageTabs-module--selected-item--YPVr3"}},QH2O:function(e,t,a){e.exports={bxTextTruncateEnd:"PageHeader-module--bx--text-truncate--end--mZWeX",bxTextTruncateFront:"PageHeader-module--bx--text-truncate--front--3zvrI",pageHeader:"PageHeader-module--page-header--3hIan",text:"PageHeader-module--text--o9LFq",pageHeaderSticky:"PageHeader-module--page-header--sticky--1ElAE",pageHeaderShifted:"PageHeader-module--page-header--shifted--1sRXO"}},YTXH:function(e,t,a){"use strict";a.r(t),a.d(t,"_frontmatter",(function(){return l})),a.d(t,"default",(function(){return o}));a("E5k/"),a("rzGZ"),a("Dq+y"),a("8npG"),a("Ggvi"),a("qKvR"),a("q1tI");var n=a("E/Ix"),r=a("013z");function i(){return(i=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var a=arguments[t];for(var n in a)Object.prototype.hasOwnProperty.call(a,n)&&(e[n]=a[n])}return e}).apply(this,arguments)}var l={},b={_frontmatter:l},c=r.a;function o(e){var t=e.components,a=function(e,t){if(null==e)return{};var a,n,r={},i=Object.keys(e);for(n=0;n<i.length;n++)a=i[n],t.indexOf(a)>=0||(r[a]=e[a]);return r}(e,["components"]);return Object(n.b)(c,i({},b,a,{components:t,mdxType:"MDXLayout"}),Object(n.b)("h2",{id:"using-db2-for-persistence"},"Using Db2 for persistence"),Object(n.b)("p",null,"This document guides a developer or administrator through the steps necessary to setup and configure ",Object(n.b)("a",i({parentName:"p"},{href:"https://cloud.ibm.com/catalog/services/db2"}),"IBM Db2 on IBM Cloud")," as a persistence layer for the IBM FHIR Server."),Object(n.b)("h3",{id:"create-a-db2-instance"},Object(n.b)("strong",{parentName:"h3"},"Create a Db2 instance")),Object(n.b)("ol",null,Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Log in to your IBM Cloud account ",Object(n.b)("a",i({parentName:"p"},{href:"https://cloud.ibm.com/"}),"Link"),".")),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Click ",Object(n.b)("inlineCode",{parentName:"p"},"Create resource"),".")),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Choose ",Object(n.b)("a",i({parentName:"p"},{href:"https://cloud.ibm.com/catalog/services/db2"}),"Db2"),".")),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Select the Pricing Plan:"),Object(n.b)("ul",{parentName:"li"},Object(n.b)("li",{parentName:"ul"},"The IBM FHIR Server recommends the Flex plan for a production workload, development and experiments."))),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Create ",Object(n.b)("inlineCode",{parentName:"p"},"Create")))),Object(n.b)("p",null,"Your instance is now creating or created."),Object(n.b)("h3",{id:"scale-the-instance"},Object(n.b)("strong",{parentName:"h3"},"Scale the instance")),Object(n.b)("p",null,"If you chose the Flex plan, you may want to scale the instance after it has been created (e.g. 4 cores, 16GB). The instance can be scaled more than once, so it doesn’t matter if you don’t get the sizing right first time."),Object(n.b)("p",null,"Note:\n1. The scaling of the instance requires a service restart.\n2. The instance CPU/Memory are scalable up and down. The storage in only scaled up."),Object(n.b)("h3",{id:"create-the-administrator-credential"},Object(n.b)("strong",{parentName:"h3"},"Create the administrator credential")),Object(n.b)("p",null,"The administrator is ",Object(n.b)("inlineCode",{parentName:"p"},"BLUADMIN")," but you need to create a credential."),Object(n.b)("ol",null,Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Navigate to the Db2 instance you created.")),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Click on the ",Object(n.b)("inlineCode",{parentName:"p"},"Service credentials")," panel."),Object(n.b)("ul",{parentName:"li"},Object(n.b)("li",{parentName:"ul"},"If the list of service credentials is empty, create a new one.",Object(n.b)("ol",{parentName:"li"},Object(n.b)("li",{parentName:"ol"},"Click ",Object(n.b)("inlineCode",{parentName:"li"},"New credential (+)")),Object(n.b)("li",{parentName:"ol"},"Enter the Name. Any name works for example, ",Object(n.b)("inlineCode",{parentName:"li"},"ibm-fhir-server-db2"),"."),Object(n.b)("li",{parentName:"ol"},"Click Add"))))),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Access the credential, select View Credentials. The entry you just created looks like the following block of JSON(the secrets are blanked out here):"),Object(n.b)("pre",{parentName:"li"},Object(n.b)("code",i({parentName:"pre"},{className:"language-json"}),'{\n    "hostname": "dashdb-txn-flex-***********.services.dal.bluemix.net",\n    "password": "bluadmin-password-very-secret",\n    "https_url": "https://dashdb-txn-flex-************.services.dal.bluemix.net:8443",\n    "port": 50000,\n    "ssldsn": "DATABASE=BLUDB;HOSTNAME=dashdb-txn-flex-************.services.dal.bluemix.net;PORT=50001;PROTOCOL=TCPIP;UID=bluadmin;PWD=bluadmin-password-very-secret;Security=SSL;",\n    "host": "dashdb-txn-flex-************.services.dal.bluemix.net",\n    "jdbcurl": "jdbc:db2://dashdb-txn-flex-************.services.dal.bluemix.net:50000/BLUDB",\n    "uri": "db2://bluadmin:bluadmin-password-very-secret@dashdb-txn-flex-************.services.dal.bluemix.net:50000/BLUDB",\n    "db": "BLUDB",\n    "dsn": "DATABASE=BLUDB;HOSTNAME=dashdb-txn-flex-************.services.dal.bluemix.net;PORT=50000;PROTOCOL=TCPIP;UID=bluadmin;PWD=bluadmin-password-very-secret;",\n    "username": "bluadmin",\n    "ssljdbcurl": "jdbc:db2://dashdb-txn-flex-************.services.dal.bluemix.net:50001/BLUDB:sslConnection=true;"\n}\n'))),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Save these details for later, as these properties are needed to deploy and manage the IBM FHIR Server schema."))),Object(n.b)("p",null,"For improved security, the ",Object(n.b)("strong",{parentName:"p"},"BLUADMIN")," user should only be used to deploy the schema objects (tables, indexes, stored procedures etc) and administer the database, NOT for connecting from the fhir-server application."),Object(n.b)("h3",{id:"add-the-fhirserver-user-and-api-key"},Object(n.b)("strong",{parentName:"h3"},"Add the FHIRSERVER user and API key")),Object(n.b)("p",null,"Following the least-privilege principle, the IBM FHIR server itself does not use ",Object(n.b)("strong",{parentName:"p"},"BLUADMIN"),". The IBM FHIR server uses an API Key associated with an ",Object(n.b)("a",i({parentName:"p"},{href:"https://cloud.ibm.com/iam/serviceids"}),"IAM Service Id"),". The IAM Service Id is mapped to a Db2 user which is granted explicit privileges to the tables and stored procedures."),Object(n.b)("p",null,"The IBM FHIR Server uses the access flow:"),Object(n.b)("ol",null,Object(n.b)("li",{parentName:"ol"},"Read API Key and the tenant key from the fhir-server-config.json"),Object(n.b)("li",{parentName:"ol"},"Connect to Db2 to access authenticated data using IAM"),Object(n.b)("li",{parentName:"ol"},"Confirm tenant-key to access authorized data")),Object(n.b)("p",null,"The steps to create the API key are:"),Object(n.b)("ol",null,Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"On the IBM Cloud console, select ",Object(n.b)("inlineCode",{parentName:"p"},"Manage")," > ",Object(n.b)("inlineCode",{parentName:"p"},"Access (IAM)"),".")),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Select the ",Object(n.b)("a",i({parentName:"p"},{href:"https://cloud.ibm.com/iam/serviceids"}),"Service IDs panel"),".")),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Click ",Object(n.b)("inlineCode",{parentName:"p"},"Create (+)")),Object(n.b)("ol",{parentName:"li"},Object(n.b)("li",{parentName:"ol"},"Enter a meaningful name, such as ",Object(n.b)("inlineCode",{parentName:"li"},"fhir-service-id"),"."),Object(n.b)("li",{parentName:"ol"},"Enter a description, such as ",Object(n.b)("inlineCode",{parentName:"li"},"for instance db2-ho"),"."),Object(n.b)("li",{parentName:"ol"},"Click the ",Object(n.b)("inlineCode",{parentName:"li"},"Create"),".")),Object(n.b)("ul",{parentName:"li"},Object(n.b)("li",{parentName:"ul"},"Note (1): If you have already created the entry, click the entry."),Object(n.b)("li",{parentName:"ul"},"Note (2): You may have to wait for the table to populate."))),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Select the ",Object(n.b)("inlineCode",{parentName:"p"},"API keys")," tab."),Object(n.b)("ul",{parentName:"li"},Object(n.b)("li",{parentName:"ul"},"Note: This tab is not the same ",Object(n.b)("inlineCode",{parentName:"li"},"IBM Cloud API keys")," on the left."))),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"To create an API Key, select ",Object(n.b)("inlineCode",{parentName:"p"},"Create (+)"),"."),Object(n.b)("ol",{parentName:"li"},Object(n.b)("li",{parentName:"ol"},"Enter a name for the api key, for example, ",Object(n.b)("inlineCode",{parentName:"li"},"fhir-server-api"),"."),Object(n.b)("li",{parentName:"ol"},"Click ",Object(n.b)("inlineCode",{parentName:"li"},"Create"),"."),Object(n.b)("li",{parentName:"ol"},"Copy or download the key.")),Object(n.b)("ul",{parentName:"li"},Object(n.b)("li",{parentName:"ul"},"Note: if you don’t retain a copy, don’t panic - you can simply delete the API key and create a new one. API keys are designed to support additions and deletions, so you add as many as you need and delete others for any reason.")))),Object(n.b)("p",null,"This API key is used in the database configuration section of the ",Object(n.b)("inlineCode",{parentName:"p"},"fhir-server-config.json")," file."),Object(n.b)("p",null,"Before the API key can be used, you need to create a Db2 user and associate it with the new ServiceId."),Object(n.b)("ol",null,Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Navigate to the ",Object(n.b)("a",i({parentName:"p"},{href:"https://cloud.ibm.com/resources"}),"Resources")," page")),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Find and click on your IBM Db2 on Cloud instance.")),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Click on Manage.")),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Click on Open Console.")),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Click ",Object(n.b)("inlineCode",{parentName:"p"},"SETTINGS")," > ",Object(n.b)("inlineCode",{parentName:"p"},"Manage Users"),"."),Object(n.b)("ul",{parentName:"li"},Object(n.b)("li",{parentName:"ul"},"Note: If you do not see ",Object(n.b)("inlineCode",{parentName:"li"},"Manage Users"),", you are probably using a ",Object(n.b)("a",i({parentName:"li"},{href:"https://www.ibm.com/support/knowledgecenter/SS6NHC/com.ibm.swg.im.dashdb.security.doc/doc/iam.html"}),"non-IAM instance"),". To confirm:",Object(n.b)("ol",{parentName:"li"},Object(n.b)("li",{parentName:"ol"},"Click Run Sql"),Object(n.b)("li",{parentName:"ol"},"Enter the SQL",Object(n.b)("pre",{parentName:"li"},Object(n.b)("code",i({parentName:"pre"},{className:"language-sql"}),"SELECT CASE WHEN VALUE = 'IBMIAMauth' THEN 1 ELSE 0 END AS IAM_ENABLED FROM SYSIBMADM.DBMCFG WHERE NAME = 'srvcon_gssplugin_list'\n"))),Object(n.b)("li",{parentName:"ol"},"You see ",Object(n.b)("inlineCode",{parentName:"li"},"0")," if not IAM enabled."))))),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Click Add. A panel opens on the right-hand side.")),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Select Add IBMid User at the top."),Object(n.b)("ul",{parentName:"li"},Object(n.b)("li",{parentName:"ul"},Object(n.b)("p",{parentName:"li"},"User ID: FHIRSERVER")),Object(n.b)("li",{parentName:"ul"},Object(n.b)("p",{parentName:"li"},"IBMid: paste the service id ",Object(n.b)("inlineCode",{parentName:"p"},"fhir-server-id")," from the Service Id created previously.")),Object(n.b)("li",{parentName:"ul"},Object(n.b)("p",{parentName:"li"},"Note (1): The page forces the value to lower-case, so ",Object(n.b)("inlineCode",{parentName:"p"},"ServiceId")," becomes ",Object(n.b)("inlineCode",{parentName:"p"},"serviceid"),". Don’t be alarmed, it still works.")),Object(n.b)("li",{parentName:"ul"},Object(n.b)("p",{parentName:"li"},"Note (2): Do NOT select Administrator. One should follow the least-privelege principal for the FHIRSERVER user.")))),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Click ",Object(n.b)("inlineCode",{parentName:"p"},"Create"),"."))),Object(n.b)("p",null,"You are now able to connect to the database as the FHIRSERVER user using only the API key created above."),Object(n.b)("h3",{id:"testing-the-connection"},Object(n.b)("strong",{parentName:"h3"},"Testing the connection")),Object(n.b)("p",null,"The ",Object(n.b)("a",i({parentName:"p"},{href:"https://repo1.maven.org/maven2/com/ibm/db2/jcc/11.5.0.0/jcc-11.5.0.0.jar"}),"Db2 driver")," is able to execute a connectivity test to check the configuration of the combo of API-key/Service-Id/Db2-User-Id."),Object(n.b)("ol",null,Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Copy the command to your code editor"),Object(n.b)("pre",{parentName:"li"},Object(n.b)("code",i({parentName:"pre"},{className:"language-bash"}),'java -cp /path/to/db2jcc4.jar com.ibm.db2.jcc.DB2Jcc  -url "jdbc:db2://<DB2-HOSTNAME>:50001/BLUDB:apiKey=<API-KEY>;securityMechanism=15;sslConnection=true;sslTrustStoreLocation=/path/to/truststore.jks;sslTrustStorePassword=<TRUSTSTORE-PASSWORD>;"\n')),Object(n.b)("ul",{parentName:"li"},Object(n.b)("li",{parentName:"ul"},"Note: Don’t forget the trailing ",Object(n.b)("inlineCode",{parentName:"li"},";")," in the URL. Some of the documented examples don’t include it, but it is required in order for the connection to work, although this may be fixed in a future driver release. This only affects this test URL, not the actual FHIR server configuration."))),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Replace the following values with your service details:"),Object(n.b)("ul",{parentName:"li"},Object(n.b)("li",{parentName:"ul"},Object(n.b)("p",{parentName:"li"},Object(n.b)("inlineCode",{parentName:"p"},"/path/to/db2jcc4.jar")," : replace with the path to your driver jar.")),Object(n.b)("li",{parentName:"ul"},Object(n.b)("p",{parentName:"li"},Object(n.b)("inlineCode",{parentName:"p"},"<DB-HOSTNAME>"),": the hostname of your Db2 service from the Service Credentials page")),Object(n.b)("li",{parentName:"ul"},Object(n.b)("p",{parentName:"li"},Object(n.b)("inlineCode",{parentName:"p"},"<API-KEY>"),": the API key value created in the previous section")),Object(n.b)("li",{parentName:"ul"},Object(n.b)("p",{parentName:"li"},Object(n.b)("inlineCode",{parentName:"p"},"<TRUSTSTORE-PASSWORD>"),": the password for your truststore")),Object(n.b)("li",{parentName:"ul"},Object(n.b)("p",{parentName:"li"},"Note: When using an API Key, no username needs to be provided. This is because the API Key maps to a ServiceId, and that ServiceId is mapped to the Db2 user.")))),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Run in your favorite terminal, and you should see no errors in the output. You should see output like:"))),Object(n.b)("pre",null,Object(n.b)("code",i({parentName:"pre"},{}),"[jcc][10516][13709]Test Connection Successful.\n")),Object(n.b)("h3",{id:"deploy-the-ibm-fhir-server-schema"},Object(n.b)("strong",{parentName:"h3"},"Deploy the IBM FHIR Server schema")),Object(n.b)("p",null,"Now that you’ve created the database and credentials, use the ",Object(n.b)("inlineCode",{parentName:"p"},"fhir-persistence-schema")," utility to deploy the IBM FHIR Server schema:"),Object(n.b)("ol",null,Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"download the ",Object(n.b)("inlineCode",{parentName:"p"},"fhir-persistence-schema")," cli jar from the corresponding project release: ",Object(n.b)("a",i({parentName:"p"},{href:"https://github.com/IBM/FHIR/releases"}),"https://github.com/IBM/FHIR/releases"))),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"create a properties file named db2.properties with the db2 connection info from IBM Cloud; for example:"),Object(n.b)("pre",{parentName:"li"},Object(n.b)("code",i({parentName:"pre"},{}),"db.host=dashdb-txn-flex-***********.services.dal.bluemix.net\ndb.port=50001\ndb.database=BLUDB\nuser=bluadmin\npassword=bluadmin-password-very-secret\nsslConnection=true\n"))),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"execute the following commands:"),Object(n.b)("pre",{parentName:"li"},Object(n.b)("code",i({parentName:"pre"},{className:"language-sh"}),"java -jar schema/fhir-persistence-schema-*-cli.jar \\\n  --prop-file db2.properties --schema-name FHIRDATA --create-schemas\njava -jar schema/fhir-persistence-schema-*-cli.jar \\\n  --prop-file db2.properties --schema-name FHIRDATA --update-schema --pool-size 2\njava -jar schema/fhir-persistence-schema-*-cli.jar \\\n  --prop-file db2.properties --schema-name FHIRDATA --grant-to FHIRSERVER --pool-size 2\njava -jar schema/fhir-persistence-schema-*-cli.jar \\\n  --prop-file db2.properties --schema-name FHIRDATA --allocate-tenant default --pool-size 2\n"))),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"note the tenantKey from the allocate-tenant step above; this will be needed to configure the IBM FHIR Server datasource in the next step"))),Object(n.b)("p",null,"For more information on using the fhir-persistence-schema cli jar, see ",Object(n.b)("a",i({parentName:"p"},{href:"https://github.com/IBM/FHIR/tree/master/fhir-persistence-schema/README.md"}),"https://github.com/IBM/FHIR/tree/master/fhir-persistence-schema/README.md"),"."),Object(n.b)("h3",{id:"configuring-an-ibm-fhir-server-datasource"},Object(n.b)("strong",{parentName:"h3"},"Configuring an IBM FHIR Server datasource")),Object(n.b)("p",null,"The IBM FHIR Server uses a proxy datasource mechanism, allowing new datasources to be added at runtime without requiring a (Liberty Profile) server restart. To configure a FHIR tenant datasource using an API-KEY, use the following template:"),Object(n.b)("pre",null,Object(n.b)("code",i({parentName:"pre"},{className:"language-json"}),'        "persistence": {\n            "datasources": {\n                "default": {\n                    "tenantKey": "",\n                    "type": "db2",\n                    "connectionProperties": {\n                        "serverName": "dashdb-txn-flex-************.services.dal.bluemix.net",\n                        "portNumber": 50001,\n                        "databaseName": "BLUDB",\n                        "apiKey": "<API-KEY>",\n                        "securityMechanism": 15,\n                        "pluginName": "IBMIAMauth",\n                        "currentSchema": "FHIRDATA",\n                        "driverType": 4,\n                        "sslConnection": true,\n                        "sslTrustStoreLocation": "resources/security/dbTruststore.jks",\n                        "sslTrustStorePassword": "change-password"\n                    }\n                }\n            }\n        }\n')),Object(n.b)("p",null,"The persistence configuration is stored in the ",Object(n.b)("inlineCode",{parentName:"p"},"fhir-server-config.json")," in the tenant and default configuration folders."),Object(n.b)("h4",{id:"mapping-from-ibm-db2-on-cloud-endpoint-credentials"},"Mapping from IBM Db2 on Cloud endpoint credentials"),Object(n.b)("p",null,"This section explains how to populate the FHIR datasource from IBM Db2 on Cloud configuration details from an example configuration:"),Object(n.b)("p",null,"Use the following table to populate your datasource."),Object(n.b)("table",null,Object(n.b)("thead",{parentName:"table"},Object(n.b)("tr",{parentName:"thead"},Object(n.b)("th",i({parentName:"tr"},{align:null}),"IBM FHIR Server Configuration"),Object(n.b)("th",i({parentName:"tr"},{align:null}),"Description"))),Object(n.b)("tbody",{parentName:"table"},Object(n.b)("tr",{parentName:"tbody"},Object(n.b)("td",i({parentName:"tr"},{align:null}),"serverName"),Object(n.b)("td",i({parentName:"tr"},{align:null}),"from the credential object select ",Object(n.b)("inlineCode",{parentName:"td"},"hostname"))),Object(n.b)("tr",{parentName:"tbody"},Object(n.b)("td",i({parentName:"tr"},{align:null}),"portNumber"),Object(n.b)("td",i({parentName:"tr"},{align:null}),"from the credential object select  ",Object(n.b)("inlineCode",{parentName:"td"},"port"))),Object(n.b)("tr",{parentName:"tbody"},Object(n.b)("td",i({parentName:"tr"},{align:null}),"databaseName"),Object(n.b)("td",i({parentName:"tr"},{align:null}),"from the credential object select  ",Object(n.b)("inlineCode",{parentName:"td"},"db"),", generally always ",Object(n.b)("inlineCode",{parentName:"td"},"BLUDB"))),Object(n.b)("tr",{parentName:"tbody"},Object(n.b)("td",i({parentName:"tr"},{align:null}),"apiKey"),Object(n.b)("td",i({parentName:"tr"},{align:null}),"from the created user in the assigned to the ",Object(n.b)("inlineCode",{parentName:"td"},"fhiruser")," group. Reference Section ",Object(n.b)("strong",{parentName:"td"},"FHIRSERVER User and API Key"))),Object(n.b)("tr",{parentName:"tbody"},Object(n.b)("td",i({parentName:"tr"},{align:null}),"securityMechanism"),Object(n.b)("td",i({parentName:"tr"},{align:null}),Object(n.b)("inlineCode",{parentName:"td"},"15")," generally set to 15 to trigger the ",Object(n.b)("inlineCode",{parentName:"td"},"apiKey")," use with IBM Cloud")),Object(n.b)("tr",{parentName:"tbody"},Object(n.b)("td",i({parentName:"tr"},{align:null}),"pluginName"),Object(n.b)("td",i({parentName:"tr"},{align:null}),Object(n.b)("inlineCode",{parentName:"td"},"IBMIAMauth")," fixed for use with the IBM Cloud")),Object(n.b)("tr",{parentName:"tbody"},Object(n.b)("td",i({parentName:"tr"},{align:null}),"currentSchema"),Object(n.b)("td",i({parentName:"tr"},{align:null}),"the schema name of your deployed tenant Schema, for instance ",Object(n.b)("inlineCode",{parentName:"td"},"FHIRDATA"))),Object(n.b)("tr",{parentName:"tbody"},Object(n.b)("td",i({parentName:"tr"},{align:null}),"driverType"),Object(n.b)("td",i({parentName:"tr"},{align:null}),Object(n.b)("inlineCode",{parentName:"td"},"4"),", always JDBC Type-4")),Object(n.b)("tr",{parentName:"tbody"},Object(n.b)("td",i({parentName:"tr"},{align:null}),"sslConnection"),Object(n.b)("td",i({parentName:"tr"},{align:null}),Object(n.b)("inlineCode",{parentName:"td"},"true"),", if you are using IBM Cloud")),Object(n.b)("tr",{parentName:"tbody"},Object(n.b)("td",i({parentName:"tr"},{align:null}),"sslTrustStoreLocation"),Object(n.b)("td",i({parentName:"tr"},{align:null}),"Local server path to the truststore, ",Object(n.b)("inlineCode",{parentName:"td"},"resources/security/dbTruststore.jks"))),Object(n.b)("tr",{parentName:"tbody"},Object(n.b)("td",i({parentName:"tr"},{align:null}),"sslTrustStorePassword"),Object(n.b)("td",i({parentName:"tr"},{align:null}),"The password to the truststore")))),Object(n.b)("ul",null,Object(n.b)("li",{parentName:"ul"},"Reference the section ",Object(n.b)("strong",{parentName:"li"},"Create the Administrator Credential")," to see an example.")),Object(n.b)("p",null,"Note, no username properties are given, because the authentication module only requires the API-KEY."),Object(n.b)("h3",{id:"configuring-a-bulkdatas-liberty-datasource-with-api-key"},Object(n.b)("strong",{parentName:"h3"},"Configuring a BulkData’s Liberty Datasource with API key")),Object(n.b)("p",null,"The IBM FHIR Server Bulk Data modules utilize Java Batch (JSR-352) from the Liberty Profile feature - ",Object(n.b)("inlineCode",{parentName:"p"},"batch-1.0"),". The batch feature is configured to use Db2 as follows:"),Object(n.b)("ol",null,Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Create a Db2 user (e.g. FHIRBATCH)")),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Associate it with a ServiceId (no need to create an Administration user, a simple user has sufficient privileges) using the same procedure you followed for the fhir-server ServiceId user.")),Object(n.b)("li",{parentName:"ol"},Object(n.b)("p",{parentName:"li"},"Using a valid API-KEY for the given ServiceId, configure a new datasource and the Java Batch persistence layer as follows:"))),Object(n.b)("pre",null,Object(n.b)("code",i({parentName:"pre"},{className:"language-xml"}),'    <dataSource id="fhirbatchDS" jndiName="jdbc/fhirbatchDB">\n        <jdbcDriver libraryRef="fhirSharedLib"/>\n        <properties.db2.jcc\n            serverName="dashdb-txn-flex-************.services.dal.bluemix.net"\n            portNumber="50001"\n            apiKey="<API-KEY>"\n            securityMechanism="15"\n            pluginName="IBMIAMauth"\n            databaseName="BLUDB"\n            currentSchema="JBATCH"\n            driverType="4" sslConnection="true" sslTrustStoreLocation="resources/security/dbTruststore.jks" sslTrustStorePassword="<TRUSTSTORE-PASSWORD>"/>\n    </dataSource>\n\n    <batchPersistence jobStoreRef="BatchDatabaseStore" />\n    <databaseStore id="BatchDatabaseStore" dataSourceRef="fhirbatchDS" schema="JBATCH" tablePrefix="" />\n')),Object(n.b)("ul",null,Object(n.b)("li",{parentName:"ul"},"Note: The Java Batch is configured in ",Object(n.b)("inlineCode",{parentName:"li"},"batchDs.xml")," and included from the IBM FHIR Server’s ",Object(n.b)("inlineCode",{parentName:"li"},"server.xml")," which is installed to ",Object(n.b)("inlineCode",{parentName:"li"},"{wlp}/usr/server/fhir-server"),"."),Object(n.b)("li",{parentName:"ul"},"Note: While this feature is not required, it’s best to configure this datasource while configuring the main datasource.")),Object(n.b)("h3",{id:"ssl-certificate"},Object(n.b)("strong",{parentName:"h3"},"SSL Certificate")),Object(n.b)("p",null,"The Db2 certificate should be added to the Liberty Profile truststore. ",Object(n.b)("em",{parentName:"p"},"Be sure to use the same Java runtime that Liberty Profile uses when manipulating any keystores.")),Object(n.b)("h3",{id:"encrypt-secrets"},Object(n.b)("strong",{parentName:"h3"},"Encrypt Secrets")),Object(n.b)("p",null,"All passwords including apiKey values should be encrypted using the Liberty Profile securityUtility."),Object(n.b)("h1",{id:"appendix-db2-lite-plan"},"Appendix: Db2 Lite Plan"),Object(n.b)("p",null,"The Lite plan is not supported for development and evaluation."),Object(n.b)("ul",null,Object(n.b)("li",{parentName:"ul"},"The schema size is larger than the available space."),Object(n.b)("li",{parentName:"ul"},"Concurrent Connections: The Lite plan has a limit of 5 concurrent connections, and the IBM FHIR Server ",Object(n.b)("inlineCode",{parentName:"li"},"fhirProxyDataSource")," needs to be updated to avoid failures. One should update the server.xml connectionManager with maxPoolSize - ",Object(n.b)("inlineCode",{parentName:"li"},'<connectionManager maxPoolSize="5"/>'),".  "),Object(n.b)("li",{parentName:"ul"},"The instance is not enabled with IAM, and you may use the ",Object(n.b)("inlineCode",{parentName:"li"},"Service Credentials")," that are created to connect to configure the datasource.")),Object(n.b)("h1",{id:"references"},Object(n.b)("strong",{parentName:"h1"},"References")),Object(n.b)("ul",null,Object(n.b)("li",{parentName:"ul"},Object(n.b)("a",i({parentName:"li"},{href:"https://cloud.ibm.com/docs/services/Db2onCloud?topic=Db2onCloud-db_details_cxn_creds"}),"Db2 on Cloud: Database details and connection credentials"))))}o.isMDXComponent=!0},Z3H1:function(e){e.exports=JSON.parse('{"data":{"site":{"siteMetadata":{"repository":{"baseUrl":"https://github.com/IBM/FHIR","subDirectory":"/docs"}}}}}')},pOBw:function(e){e.exports=JSON.parse('{"data":{"site":{"pathPrefix":"/FHIR"}}}')}}]);
//# sourceMappingURL=component---src-pages-guides-db-2-on-cloud-setup-md-6ce203ba05d5f53fc675.js.map