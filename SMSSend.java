{"payload":{"allShortcutsEnabled":true,"fileTree":{"":{"items":[{"name":"SMSSend.java","path":"SMSSend.java","contentType":"file"},{"name":"SmsWebhookHandler.java","path":"SmsWebhookHandler.java","contentType":"file"},{"name":"TanzaniaWeatherApp.java","path":"TanzaniaWeatherApp.java","contentType":"file"},{"name":"TanzaniaWeatherData.java","path":"TanzaniaWeatherData.java","contentType":"file"},{"name":"readme","path":"readme","contentType":"file"}],"totalCount":5}},"fileTreeProcessingTime":2.82855,"foldersToFetch":[],"reducedMotionEnabled":"system","repo":{"id":515255083,"defaultBranch":"main","name":"Tanzania-Weather-SMS","ownerLogin":"BRIANMMARI10","currentUserCanPush":true,"isFork":false,"isEmpty":false,"createdAt":"2022-07-18T12:10:54.000-04:00","ownerAvatar":"https://avatars.githubusercontent.com/u/79646788?v=4","public":true,"private":false,"isOrgOwned":false},"symbolsExpanded":true,"treeExpanded":true,"refInfo":{"name":"main","listCacheKey":"v0:1658161023.9010391","canEdit":true,"refType":"branch","currentOid":"4825a4dbea25661016e7ffcbe10f68865bc5e885"},"path":"SMSSend.java","currentUser":{"id":79646788,"login":"BRIANMMARI10","userEmail":"brnmmari@gmail.com"},"blob":{"rawLines":["// I got the library from https://www.twilio.com/docs/libraries/java","import com.twilio.Twilio;","import com.twilio.rest.api.v2010.account.Message;","","","public class SMSSend {","","    public static final String ACCOUNT_SID = \"AC9f29324e355dee3428b5e92198904789\";","    public static final String AUTH_TOKEN = \"2260f2f66f0288ee0751a4c66acdb886\";","","    // Initializes the constructor","    public SMSSend() {","","    }","","    public void send(String phonenumber, String text) {","","        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);","        Message message = Message.creator(","                new com.twilio.type.PhoneNumber(phonenumber),","                \"MG3a54a54f8d1324d710aa495285290bc5\",","                text).create();","","","        System.out.println(message.getSid());","                                                                                                                                                                                                                                                                             dszzåΩΩ                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ","","","    public static void main(String[] args){","","        // Creates SMSSend object","        SMSSend outputSMS = new SMSSend();","","    }","","}"],"stylingDirectives":[[{"start":0,"end":68,"cssClass":"pl-c"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":17,"cssClass":"pl-s1"},{"start":18,"end":24,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":17,"cssClass":"pl-s1"},{"start":18,"end":22,"cssClass":"pl-s1"},{"start":23,"end":26,"cssClass":"pl-s1"},{"start":27,"end":32,"cssClass":"pl-s1"},{"start":33,"end":40,"cssClass":"pl-s1"},{"start":41,"end":48,"cssClass":"pl-s1"}],[],[],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":12,"cssClass":"pl-k"},{"start":13,"end":20,"cssClass":"pl-smi"}],[],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":17,"cssClass":"pl-k"},{"start":18,"end":23,"cssClass":"pl-k"},{"start":24,"end":30,"cssClass":"pl-smi"},{"start":31,"end":42,"cssClass":"pl-c1"},{"start":45,"end":81,"cssClass":"pl-s"}],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":17,"cssClass":"pl-k"},{"start":18,"end":23,"cssClass":"pl-k"},{"start":24,"end":30,"cssClass":"pl-smi"},{"start":31,"end":41,"cssClass":"pl-c1"},{"start":44,"end":78,"cssClass":"pl-s"}],[],[{"start":4,"end":34,"cssClass":"pl-c"}],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":18,"cssClass":"pl-smi"}],[],[],[],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":15,"cssClass":"pl-smi"},{"start":16,"end":20,"cssClass":"pl-en"},{"start":21,"end":27,"cssClass":"pl-smi"},{"start":28,"end":39,"cssClass":"pl-s1"},{"start":41,"end":47,"cssClass":"pl-smi"},{"start":48,"end":52,"cssClass":"pl-s1"}],[],[{"start":8,"end":14,"cssClass":"pl-smi"},{"start":15,"end":19,"cssClass":"pl-en"},{"start":20,"end":31,"cssClass":"pl-c1"},{"start":33,"end":43,"cssClass":"pl-c1"}],[{"start":8,"end":15,"cssClass":"pl-smi"},{"start":16,"end":23,"cssClass":"pl-s1"},{"start":26,"end":33,"cssClass":"pl-smi"},{"start":34,"end":41,"cssClass":"pl-en"}],[{"start":16,"end":19,"cssClass":"pl-k"},{"start":20,"end":23,"cssClass":"pl-smi"},{"start":24,"end":30,"cssClass":"pl-smi"},{"start":31,"end":35,"cssClass":"pl-smi"},{"start":36,"end":47,"cssClass":"pl-smi"},{"start":48,"end":59,"cssClass":"pl-s1"}],[{"start":16,"end":52,"cssClass":"pl-s"}],[{"start":16,"end":20,"cssClass":"pl-s1"},{"start":22,"end":28,"cssClass":"pl-en"}],[],[],[{"start":8,"end":14,"cssClass":"pl-smi"},{"start":15,"end":18,"cssClass":"pl-s1"},{"start":19,"end":26,"cssClass":"pl-en"},{"start":27,"end":34,"cssClass":"pl-s1"},{"start":35,"end":41,"cssClass":"pl-en"}],[{"start":269,"end":276,"cssClass":"pl-smi"}],[],[],[{"start":4,"end":10,"cssClass":"pl-s1"},{"start":11,"end":17,"cssClass":"pl-k"},{"start":18,"end":22,"cssClass":"pl-smi"},{"start":23,"end":27,"cssClass":"pl-s1"},{"start":28,"end":34,"cssClass":"pl-smi"},{"start":37,"end":41,"cssClass":"pl-s1"}],[],[{"start":8,"end":33,"cssClass":"pl-c"}],[{"start":8,"end":15,"cssClass":"pl-smi"},{"start":16,"end":25,"cssClass":"pl-s1"},{"start":28,"end":31,"cssClass":"pl-k"},{"start":32,"end":39,"cssClass":"pl-smi"}],[],[],[],[],[],[]],"csv":null,"csvError":null,"dependabotInfo":{"showConfigurationBanner":null,"configFilePath":null,"networkDependabotPath":"/BRIANMMARI10/Tanzania-Weather-SMS/network/updates","dismissConfigurationNoticePath":"/settings/dismiss-notice/dependabot_configuration_notice","configurationNoticeDismissed":false,"repoAlertsPath":"/BRIANMMARI10/Tanzania-Weather-SMS/security/dependabot","repoSecurityAndAnalysisPath":"/BRIANMMARI10/Tanzania-Weather-SMS/settings/security_analysis","repoOwnerIsOrg":false,"currentUserCanAdminRepo":true},"displayName":"SMSSend.java","displayUrl":"https://github.com/BRIANMMARI10/Tanzania-Weather-SMS/blob/main/SMSSend.java?raw=true","headerInfo":{"blobSize":"23.7 KB","deleteInfo":{"deleteTooltip":"Delete this file"},"editInfo":{"editTooltip":"Edit this file"},"ghDesktopPath":"x-github-client://openRepo/https://github.com/BRIANMMARI10/Tanzania-Weather-SMS?branch=main&filepath=SMSSend.java","gitLfsPath":null,"onBranch":true,"shortPath":"36d2974","siteNavLoginPath":"/login?return_to=https%3A%2F%2Fgithub.com%2FBRIANMMARI10%2FTanzania-Weather-SMS%2Fblob%2Fmain%2FSMSSend.java","isCSV":false,"isRichtext":false,"toc":null,"lineInfo":{"truncatedLoc":"38","truncatedSloc":"22"},"mode":"file"},"image":false,"isCodeownersFile":null,"isPlain":false,"isValidLegacyIssueTemplate":false,"issueTemplateHelpUrl":"https://docs.github.com/articles/about-issue-and-pull-request-templates","issueTemplate":null,"discussionTemplate":null,"language":"Java","languageID":181,"large":false,"loggedIn":true,"newDiscussionPath":"/BRIANMMARI10/Tanzania-Weather-SMS/discussions/new","newIssuePath":"/BRIANMMARI10/Tanzania-Weather-SMS/issues/new","planSupportInfo":{"repoIsFork":null,"repoOwnedByCurrentUser":null,"requestFullPath":"/BRIANMMARI10/Tanzania-Weather-SMS/blob/main/SMSSend.java","showFreeOrgGatedFeatureMessage":null,"showPlanSupportBanner":null,"upgradeDataAttributes":null,"upgradePath":null},"publishBannersInfo":{"dismissActionNoticePath":"/settings/dismiss-notice/publish_action_from_dockerfile","dismissStackNoticePath":"/settings/dismiss-notice/publish_stack_from_file","releasePath":"/BRIANMMARI10/Tanzania-Weather-SMS/releases/new?marketplace=true","showPublishActionBanner":false,"showPublishStackBanner":false},"rawBlobUrl":"https://github.com/BRIANMMARI10/Tanzania-Weather-SMS/raw/main/SMSSend.java","renderImageOrRaw":false,"richText":null,"renderedFileInfo":null,"shortPath":null,"tabSize":8,"topBannersInfo":{"overridingGlobalFundingFile":false,"globalPreferredFundingPath":null,"repoOwner":"BRIANMMARI10","repoName":"Tanzania-Weather-SMS","showInvalidCitationWarning":false,"citationHelpUrl":"https://docs.github.com/en/github/creating-cloning-and-archiving-repositories/creating-a-repository-on-github/about-citation-files","showDependabotConfigurationBanner":null,"actionsOnboardingTip":null},"truncated":false,"viewable":true,"workflowRedirectUrl":null,"symbols":{"timed_out":true,"not_analyzed":false,"symbols":[{"name":"SMSSend","kind":"class","ident_start":160,"ident_end":167,"extent_start":147,"extent_end":24293,"fully_qualified_name":"SMSSend","ident_utf16":{"start":{"line_number":5,"utf16_col":13},"end":{"line_number":5,"utf16_col":20}},"extent_utf16":{"start":{"line_number":5,"utf16_col":0},"end":{"line_number":35,"utf16_col":1}}},{"name":"ACCOUNT_SID","kind":"field","ident_start":202,"ident_end":213,"extent_start":175,"extent_end":253,"fully_qualified_name":"SMSSend::ACCOUNT_SID","ident_utf16":{"start":{"line_number":7,"utf16_col":31},"end":{"line_number":7,"utf16_col":42}},"extent_utf16":{"start":{"line_number":7,"utf16_col":4},"end":{"line_number":7,"utf16_col":82}}},{"name":"AUTH_TOKEN","kind":"field","ident_start":285,"ident_end":295,"extent_start":258,"extent_end":333,"fully_qualified_name":"SMSSend::AUTH_TOKEN","ident_utf16":{"start":{"line_number":8,"utf16_col":31},"end":{"line_number":8,"utf16_col":41}},"extent_utf16":{"start":{"line_number":8,"utf16_col":4},"end":{"line_number":8,"utf16_col":79}}},{"name":"SMSSend","kind":"method","ident_start":381,"ident_end":388,"extent_start":374,"extent_end":399,"fully_qualified_name":"SMSSend::SMSSend","ident_utf16":{"start":{"line_number":11,"utf16_col":11},"end":{"line_number":11,"utf16_col":18}},"extent_utf16":{"start":{"line_number":11,"utf16_col":4},"end":{"line_number":13,"utf16_col":5}}},{"name":"send","kind":"method","ident_start":417,"ident_end":421,"extent_start":405,"extent_end":24293,"fully_qualified_name":"SMSSend::send","ident_utf16":{"start":{"line_number":15,"utf16_col":16},"end":{"line_number":15,"utf16_col":20}},"extent_utf16":{"start":{"line_number":15,"utf16_col":4},"end":{"line_number":35,"utf16_col":1}}}]}},"copilotInfo":{"documentationUrl":"https://docs.github.com/copilot/overview-of-github-copilot/about-github-copilot-for-individuals","notices":{"codeViewPopover":{"dismissed":false,"dismissPath":"/settings/dismiss-notice/code_view_copilot_popover"}},"userAccess":{"accessAllowed":false,"hasSubscriptionEnded":false,"orgHasCFBAccess":false,"userHasCFIAccess":false,"userHasOrgs":false,"userIsOrgAdmin":false,"userIsOrgMember":false,"business":null,"featureRequestInfo":null}},"copilotAccessAllowed":false,"csrf_tokens":{"/BRIANMMARI10/Tanzania-Weather-SMS/branches":{"post":"IvXYGI1irUu-VWor523_BblVVYKHcLJ8ju3Sxj7wcZYtxF8vYw9eKXHm3NfgXCWGekaM11deoWmFAN0x5hrC2g"},"/repos/preferences":{"post":"id804bt3RIjz8twNs5UpkjL8eqeX36JW1xI3fC_kMBKky2zE-B9Uq3RXGtcm_eyy1NoTVurftvF_M_Wdq6voVA"}}},"title":"Tanzania-Weather-SMS/SMSSend.java at main · BRIANMMARI10/Tanzania-Weather-SMS"}