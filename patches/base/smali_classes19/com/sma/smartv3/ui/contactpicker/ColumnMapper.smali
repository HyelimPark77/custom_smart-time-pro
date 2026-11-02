.class Lcom/sma/smartv3/ui/contactpicker/ColumnMapper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static mapDisplayName(Landroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "cursor",
            "contact",
            "columnIndex"
        }
    .end annotation

    invoke-interface {p0, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/contactpicker/Contact;->setDisplayName(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static mapEmail(Landroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "cursor",
            "contact",
            "columnIndex"
        }
    .end annotation

    invoke-interface {p0, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getEmails()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static mapInVisibleGroup(Landroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "cursor",
            "contact",
            "columnIndex"
        }
    .end annotation

    invoke-interface {p0, p2}, Landroid/database/Cursor;->getInt(I)I

    move-result p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/contactpicker/Contact;->setInVisibleGroup(I)V

    return-void
.end method

.method public static mapPhoneNumber(Landroid/content/Context;Landroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;III)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "con",
            "cursor",
            "contact",
            "noColumnIndex",
            "typeColIndex",
            "labelColIndex"
        }
    .end annotation

    invoke-interface {p1, p3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p4}, Landroid/database/Cursor;->getInt(I)I

    move-result p4

    invoke-interface {p1, p5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-static {p0, p4, p1}, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->getTypeLabel(Landroid/content/res/Resources;ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "\\s+"

    const-string p4, ""

    invoke-virtual {p3, p1, p4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getPhoneNumbers()Ljava/util/List;

    move-result-object p2

    new-instance p3, Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p0, p1}, Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static mapPhoto(Landroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "cursor",
            "contact",
            "columnIndex"
        }
    .end annotation

    invoke-interface {p0, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/contactpicker/Contact;->setPhoto(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method public static mapStarred(Landroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "cursor",
            "contact",
            "columnIndex"
        }
    .end annotation

    invoke-interface {p0, p2}, Landroid/database/Cursor;->getInt(I)I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/contactpicker/Contact;->setStarred(Z)V

    return-void
.end method

.method public static mapThumbnail(Landroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "cursor",
            "contact",
            "columnIndex"
        }
    .end annotation

    invoke-interface {p0, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/contactpicker/Contact;->setThumbnail(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method
