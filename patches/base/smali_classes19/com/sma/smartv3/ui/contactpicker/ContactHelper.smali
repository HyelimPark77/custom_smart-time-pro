.class public Lcom/sma/smartv3/ui/contactpicker/ContactHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CONTACT_PICKER_REQUEST:I = 0x3df

.field private static final DISPLAY_NAME:Ljava/lang/String;

.field private static final EMAIL_CONTENT_URI:Landroid/net/Uri;

.field private static final EMAIL_PROJECTION:[Ljava/lang/String;

.field private static final NUMBER_PROJECTION:[Ljava/lang/String;

.field private static final PHONE_CONTENT_URI:Landroid/net/Uri;

.field private static final PROJECTION:[Ljava/lang/String;


# instance fields
.field private cancelLoad:Z

.field private mContext:Landroid/content/Context;

.field private mResolver:Landroid/content/ContentResolver;

.field private phoneCursor:Landroid/database/Cursor;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const-string v2, "display_name"

    sput-object v2, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->DISPLAY_NAME:Ljava/lang/String;

    sget-object v0, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    sput-object v0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->PHONE_CONTENT_URI:Landroid/net/Uri;

    sget-object v0, Landroid/provider/ContactsContract$CommonDataKinds$Email;->CONTENT_URI:Landroid/net/Uri;

    sput-object v0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->EMAIL_CONTENT_URI:Landroid/net/Uri;

    const-string v5, "photo_thumb_uri"

    const-string v6, "has_phone_number"

    const-string v0, "_id"

    const-string v1, "in_visible_group"

    const-string v3, "starred"

    const-string v4, "photo_uri"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->PROJECTION:[Ljava/lang/String;

    const-string v0, "contact_id"

    const-string v1, "data1"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->EMAIL_PROJECTION:[Ljava/lang/String;

    const-string v2, "data2"

    const-string v3, "data3"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->NUMBER_PROJECTION:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->cancelLoad:Z

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->mResolver:Landroid/content/ContentResolver;

    return-void
.end method

.method private createCursor(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "filter"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->mResolver:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    sget-object v2, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->PROJECTION:[Ljava/lang/String;

    const/4 v4, 0x0

    sget-object v5, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->DISPLAY_NAME:Ljava/lang/String;

    move-object v3, p1

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method private getAllPhoneNumber()Ljava/util/HashMap;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->phoneCursor:Landroid/database/Cursor;

    if-nez v1, :cond_2

    iget-object v2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->mResolver:Landroid/content/ContentResolver;

    sget-object v3, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->PHONE_CONTENT_URI:Landroid/net/Uri;

    sget-object v4, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->NUMBER_PROJECTION:[Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->phoneCursor:Landroid/database/Cursor;

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->phoneCursor:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->phoneCursor:Landroid/database/Cursor;

    const-string v2, "contact_id"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->phoneCursor:Landroid/database/Cursor;

    const-string v3, "data1"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->phoneCursor:Landroid/database/Cursor;

    const-string v4, "data2"

    invoke-interface {v3, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v3, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->phoneCursor:Landroid/database/Cursor;

    const-string v5, "data3"

    invoke-interface {v4, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v4, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-static {v5, v3, v4}, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->getTypeLabel(Landroid/content/res/Resources;ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-nez v4, :cond_1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "\\s+"

    const-string v5, ""

    invoke-virtual {v2, v1, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "phoneNumbers size = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-object v0
.end method

.method private getEmail(JLcom/sma/smartv3/ui/contactpicker/Contact;)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "id",
            "contact"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->mResolver:Landroid/content/ContentResolver;

    sget-object v1, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->EMAIL_CONTENT_URI:Landroid/net/Uri;

    sget-object v2, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->EMAIL_PROJECTION:[Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const-string v3, "contact_id = ?"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string p2, "data1"

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p2

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p3, p2}, Lcom/sma/smartv3/ui/contactpicker/ColumnMapper;->mapEmail(Landroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V

    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_1
    return-void
.end method

.method private getFilter(Lcom/sma/smartv3/ui/contactpicker/LimitColumn;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "limitColumn"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper$1;->$SwitchMap$com$sma$smartv3$ui$contactpicker$LimitColumn:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string p1, "has_phone_number > 0"

    return-object p1
.end method

.method private getPhoneNumber(JLandroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V
    .locals 13
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "id",
            "cursor",
            "contact",
            "hasPhoneNumberColumnIndex"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    move-object/from16 v0, p3

    move/from16 v1, p5

    .line 6
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    .line 7
    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->mResolver:Landroid/content/ContentResolver;

    sget-object v2, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->PHONE_CONTENT_URI:Landroid/net/Uri;

    sget-object v3, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->NUMBER_PROJECTION:[Ljava/lang/String;

    .line 8
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    .line 9
    const-string v4, "contact_id = ?"

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    if-eqz v8, :cond_1

    .line 10
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    .line 11
    const-string p1, "data1"

    invoke-interface {v8, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    .line 12
    const-string p1, "data2"

    invoke-interface {v8, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 13
    const-string p1, "data3"

    invoke-interface {v8, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 14
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->isAfterLast()Z

    move-result p1

    if-nez p1, :cond_0

    .line 15
    iget-object v7, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->mContext:Landroid/content/Context;

    move-object/from16 v9, p4

    invoke-static/range {v7 .. v12}, Lcom/sma/smartv3/ui/contactpicker/ColumnMapper;->mapPhoneNumber(Landroid/content/Context;Landroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;III)V

    .line 16
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    :cond_1
    return-void
.end method

.method private getPhoneNumber(JLandroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;ILjava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "id",
            "cursor",
            "contact",
            "hasPhoneNumberColumnIndex",
            "phoneNumbers"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroid/database/Cursor;",
            "Lcom/sma/smartv3/ui/contactpicker/Contact;",
            "I",
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p3, p5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p3

    if-lez p3, :cond_0

    .line 2
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p6, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    if-lez p2, :cond_0

    .line 4
    invoke-virtual {p4}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getPhoneNumbers()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 5
    invoke-virtual {p4}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getPhoneNumbers()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public load(Lcom/sma/smartv3/ui/contactpicker/LimitColumn;Lcom/sma/smartv3/ui/contactpicker/LoadCallBack;)V
    .locals 20
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "columnLimitChoice",
            "callBack"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-direct {v0}, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->getAllPhoneNumber()Ljava/util/HashMap;

    move-result-object v6

    new-instance v10, Landroid/util/LongSparseArray;

    invoke-direct {v10}, Landroid/util/LongSparseArray;-><init>()V

    invoke-direct/range {p0 .. p1}, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->getFilter(Lcom/sma/smartv3/ui/contactpicker/LimitColumn;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->createCursor(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    const-string v1, "_id"

    invoke-interface {v3, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    const-string v1, "in_visible_group"

    invoke-interface {v3, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    sget-object v1, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->DISPLAY_NAME:Ljava/lang/String;

    invoke-interface {v3, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    const-string v1, "starred"

    invoke-interface {v3, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    const-string v1, "photo_uri"

    invoke-interface {v3, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    const-string v1, "photo_thumb_uri"

    invoke-interface {v3, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    const-string v2, "has_phone_number"

    invoke-interface {v3, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_6

    iget-boolean v2, v0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->cancelLoad:Z

    if-nez v2, :cond_6

    move v2, v5

    move-object/from16 v16, v6

    invoke-interface {v3, v11}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    invoke-virtual {v10, v5, v6, v4}, Landroid/util/LongSparseArray;->get(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/ui/contactpicker/Contact;

    if-nez v4, :cond_0

    new-instance v4, Lcom/sma/smartv3/ui/contactpicker/Contact;

    invoke-direct {v4, v5, v6}, Lcom/sma/smartv3/ui/contactpicker/Contact;-><init>(J)V

    :cond_0
    invoke-static {v3, v4, v12}, Lcom/sma/smartv3/ui/contactpicker/ColumnMapper;->mapInVisibleGroup(Landroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V

    invoke-static {v3, v4, v13}, Lcom/sma/smartv3/ui/contactpicker/ColumnMapper;->mapDisplayName(Landroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V

    invoke-static {v3, v4, v14}, Lcom/sma/smartv3/ui/contactpicker/ColumnMapper;->mapStarred(Landroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V

    invoke-static {v3, v4, v15}, Lcom/sma/smartv3/ui/contactpicker/ColumnMapper;->mapPhoto(Landroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V

    invoke-static {v3, v4, v1}, Lcom/sma/smartv3/ui/contactpicker/ColumnMapper;->mapThumbnail(Landroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V

    sget-object v17, Lcom/sma/smartv3/ui/contactpicker/ContactHelper$1;->$SwitchMap$com$sma$smartv3$ui$contactpicker$LimitColumn:[I

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v18

    move/from16 v19, v1

    aget v1, v17, v18

    move/from16 v17, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    move-wide v1, v5

    move/from16 v5, v17

    goto :goto_1

    :cond_1
    invoke-direct {v0, v5, v6, v4}, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->getEmail(JLcom/sma/smartv3/ui/contactpicker/Contact;)V

    move-wide v1, v5

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->getPhoneNumber(JLandroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V

    move-object/from16 v0, p0

    goto :goto_1

    :cond_2
    move-wide v1, v5

    move-object/from16 v6, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->getPhoneNumber(JLandroid/database/Cursor;Lcom/sma/smartv3/ui/contactpicker/Contact;ILjava/util/HashMap;)V

    goto :goto_1

    :cond_3
    move-wide v1, v5

    move/from16 v5, v17

    invoke-direct {v0, v1, v2, v4}, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->getEmail(JLcom/sma/smartv3/ui/contactpicker/Contact;)V

    :goto_1
    sget-object v6, Lcom/sma/smartv3/ui/contactpicker/LimitColumn;->EMAIL:Lcom/sma/smartv3/ui/contactpicker/LimitColumn;

    move-object/from16 v17, v3

    move-object/from16 v3, p1

    if-ne v3, v6, :cond_4

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getEmails()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_5

    invoke-virtual {v10, v1, v2, v4}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    invoke-interface {v7, v4}, Lcom/sma/smartv3/ui/contactpicker/LoadCallBack;->onNext(Lcom/sma/smartv3/ui/contactpicker/Contact;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v10, v1, v2, v4}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    invoke-interface {v7, v4}, Lcom/sma/smartv3/ui/contactpicker/LoadCallBack;->onNext(Lcom/sma/smartv3/ui/contactpicker/Contact;)V

    :cond_5
    :goto_2
    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->moveToNext()Z

    move-object/from16 v6, v16

    move-object/from16 v3, v17

    move/from16 v1, v19

    goto/16 :goto_0

    :cond_6
    move-object/from16 v17, v3

    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->close()V

    iget-object v1, v0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->phoneCursor:Landroid/database/Cursor;

    if-eqz v1, :cond_7

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    iput-object v4, v0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->phoneCursor:Landroid/database/Cursor;

    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u52a0\u8f7d\u5b8c\u6210\uff0c\u8017\u65f6\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v8

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "ms"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public setCancelLoad(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "cancel"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactHelper;->cancelLoad:Z

    return-void
.end method
