package com.sioo.model;

import java.util.Date;

public class ChannelInfo {
    private String id;

    private String tenantId;

    private String channelName;

    private Integer channelType;

    private Integer recordType;

    private Integer network;

    private String account;

    private String passpwd;

    private Integer expidLen;

    private Integer sendRate;

    private String channelIp;

    private Integer channelPort;

    private String corpid;

    private String number;

    private String serviceid;

    private Integer msgformat;

    private String localIp;

    private Integer localPort;

    private String nodeid;

    private String url;

    private String provider;

    private Integer wordsLen;

    private Integer wordsMaxlen;

    private Integer signPosition;

    private Double price;

    private String balance;

    private String channelDevelopFile;

    private String tradeLabel;

    private Integer status;

    private String loginUrl;

    private String submitUrl;

    private String balanceUrl;

    private Long statusUpMethod;

    private String statusUrl;

    private String upUrl;

    private Integer isProvince;

    private String area;

    private String shieldArea;

    private String mobileShieldArea;

    private String telecomShieldArea;

    private String unicomShieldArea;

    private Integer extnoAppendNumber;

    private Integer isDeleted;

    private String rejectReason;

    private String comments;

    private String creator;

    private Date createDate;

    private Date updateDate;

    private String updater;

    private Integer routeType;

    private Integer routeChannel;

    private Integer routeRequire;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Integer getChannelType() {
        return channelType;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    public Integer getRecordType() {
        return recordType;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
    }

    public Integer getNetwork() {
        return network;
    }

    public void setNetwork(Integer network) {
        this.network = network;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPasspwd() {
        return passpwd;
    }

    public void setPasspwd(String passpwd) {
        this.passpwd = passpwd == null ? null : passpwd.trim();
    }

    public Integer getExpidLen() {
        return expidLen;
    }

    public void setExpidLen(Integer expidLen) {
        this.expidLen = expidLen;
    }

    public Integer getSendRate() {
        return sendRate;
    }

    public void setSendRate(Integer sendRate) {
        this.sendRate = sendRate;
    }

    public String getChannelIp() {
        return channelIp;
    }

    public void setChannelIp(String channelIp) {
        this.channelIp = channelIp == null ? null : channelIp.trim();
    }

    public Integer getChannelPort() {
        return channelPort;
    }

    public void setChannelPort(Integer channelPort) {
        this.channelPort = channelPort;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid == null ? null : corpid.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid == null ? null : serviceid.trim();
    }

    public Integer getMsgformat() {
        return msgformat;
    }

    public void setMsgformat(Integer msgformat) {
        this.msgformat = msgformat;
    }

    public String getLocalIp() {
        return localIp;
    }

    public void setLocalIp(String localIp) {
        this.localIp = localIp == null ? null : localIp.trim();
    }

    public Integer getLocalPort() {
        return localPort;
    }

    public void setLocalPort(Integer localPort) {
        this.localPort = localPort;
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    public Integer getWordsLen() {
        return wordsLen;
    }

    public void setWordsLen(Integer wordsLen) {
        this.wordsLen = wordsLen;
    }

    public Integer getWordsMaxlen() {
        return wordsMaxlen;
    }

    public void setWordsMaxlen(Integer wordsMaxlen) {
        this.wordsMaxlen = wordsMaxlen;
    }

    public Integer getSignPosition() {
        return signPosition;
    }

    public void setSignPosition(Integer signPosition) {
        this.signPosition = signPosition;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance == null ? null : balance.trim();
    }

    public String getChannelDevelopFile() {
        return channelDevelopFile;
    }

    public void setChannelDevelopFile(String channelDevelopFile) {
        this.channelDevelopFile = channelDevelopFile == null ? null : channelDevelopFile.trim();
    }

    public String getTradeLabel() {
        return tradeLabel;
    }

    public void setTradeLabel(String tradeLabel) {
        this.tradeLabel = tradeLabel == null ? null : tradeLabel.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl == null ? null : loginUrl.trim();
    }

    public String getSubmitUrl() {
        return submitUrl;
    }

    public void setSubmitUrl(String submitUrl) {
        this.submitUrl = submitUrl == null ? null : submitUrl.trim();
    }

    public String getBalanceUrl() {
        return balanceUrl;
    }

    public void setBalanceUrl(String balanceUrl) {
        this.balanceUrl = balanceUrl == null ? null : balanceUrl.trim();
    }

    public Long getStatusUpMethod() {
        return statusUpMethod;
    }

    public void setStatusUpMethod(Long statusUpMethod) {
        this.statusUpMethod = statusUpMethod;
    }

    public String getStatusUrl() {
        return statusUrl;
    }

    public void setStatusUrl(String statusUrl) {
        this.statusUrl = statusUrl == null ? null : statusUrl.trim();
    }

    public String getUpUrl() {
        return upUrl;
    }

    public void setUpUrl(String upUrl) {
        this.upUrl = upUrl == null ? null : upUrl.trim();
    }

    public Integer getIsProvince() {
        return isProvince;
    }

    public void setIsProvince(Integer isProvince) {
        this.isProvince = isProvince;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getShieldArea() {
        return shieldArea;
    }

    public void setShieldArea(String shieldArea) {
        this.shieldArea = shieldArea == null ? null : shieldArea.trim();
    }

    public String getMobileShieldArea() {
        return mobileShieldArea;
    }

    public void setMobileShieldArea(String mobileShieldArea) {
        this.mobileShieldArea = mobileShieldArea == null ? null : mobileShieldArea.trim();
    }

    public String getTelecomShieldArea() {
        return telecomShieldArea;
    }

    public void setTelecomShieldArea(String telecomShieldArea) {
        this.telecomShieldArea = telecomShieldArea == null ? null : telecomShieldArea.trim();
    }

    public String getUnicomShieldArea() {
        return unicomShieldArea;
    }

    public void setUnicomShieldArea(String unicomShieldArea) {
        this.unicomShieldArea = unicomShieldArea == null ? null : unicomShieldArea.trim();
    }

    public Integer getExtnoAppendNumber() {
        return extnoAppendNumber;
    }

    public void setExtnoAppendNumber(Integer extnoAppendNumber) {
        this.extnoAppendNumber = extnoAppendNumber;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason == null ? null : rejectReason.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    public Integer getRouteType() {
        return routeType;
    }

    public void setRouteType(Integer routeType) {
        this.routeType = routeType;
    }

    public Integer getRouteChannel() {
        return routeChannel;
    }

    public void setRouteChannel(Integer routeChannel) {
        this.routeChannel = routeChannel;
    }

    public Integer getRouteRequire() {
        return routeRequire;
    }

    public void setRouteRequire(Integer routeRequire) {
        this.routeRequire = routeRequire;
    }
}