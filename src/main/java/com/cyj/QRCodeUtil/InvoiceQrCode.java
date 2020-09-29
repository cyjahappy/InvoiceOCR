package com.cyj.QRCodeUtil;

public class InvoiceQrCode {
    /*
        invoiceCode             发票代码
        invoiceNumber           发票号码
        totalAmount             合计金额
        date                    开票日期
        invoiceVerificationCode 发票校验码
     */
    private final String invoiceCode;
    private final String invoiceNumber;
    private final String totalAmount;
    private final String date;
    private final String invoiceVerificationCode;

    public InvoiceQrCode(String invoiceQrCode) {
        String [] invoiceQrCodeArray = invoiceQrCode.split(",");
        this.invoiceCode = invoiceQrCodeArray[2];
        this.invoiceNumber = invoiceQrCodeArray[3];
        this.totalAmount = invoiceQrCodeArray[4];
        this.date = invoiceQrCodeArray[5];
        this.invoiceVerificationCode = invoiceQrCodeArray[6];
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public String getDate() {
        return date;
    }

    public String getInvoiceVerificationCode() {
        return invoiceVerificationCode;
    }

    @Override
    public String toString(){
        return "发票代码: " + this.invoiceCode +
               "\n发票号码: " + this.invoiceNumber +
               "\n合计金额: " + this.totalAmount +
               "\n开票日期: " + this.date +
               "\n发票校验码: " + this.invoiceVerificationCode;
    }

}
