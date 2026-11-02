.class public final Lcom/sma/smartv3/ble/MyNotificationListenerService;
.super Landroid/service/notification/NotificationListenerService;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ble/MyNotificationListenerService$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMyNotificationListenerService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyNotificationListenerService.kt\ncom/sma/smartv3/ble/MyNotificationListenerService\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,699:1\n13805#2,2:700\n1#3:702\n*S KotlinDebug\n*F\n+ 1 MyNotificationListenerService.kt\ncom/sma/smartv3/ble/MyNotificationListenerService\n*L\n134#1:700,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMyNotificationListenerService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyNotificationListenerService.kt\ncom/sma/smartv3/ble/MyNotificationListenerService\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,699:1\n13805#2,2:700\n1#3:702\n*S KotlinDebug\n*F\n+ 1 MyNotificationListenerService.kt\ncom/sma/smartv3/ble/MyNotificationListenerService\n*L\n134#1:700,2\n*E\n"
    }
.end annotation


# static fields
.field public static final O001I:Lcom/sma/smartv3/ble/MyNotificationListenerService$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XXO:Ljava/lang/String; = "MyNotificationListenerService"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field public I1:Lcom/szabh/smable3/music/MusicControllerCompat;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public IO:J

.field public final X0i1O:Ljava/util/Map;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public X11iII1O1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X1IX:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XXX11i:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iIXi1iiXI:Ljava/util/Map;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public iX1O1:J

.field public final iXiX011:Ljava/util/Map;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ble/MyNotificationListenerService$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ble/MyNotificationListenerService$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ble/MyNotificationListenerService;->O001I:Lcom/sma/smartv3/ble/MyNotificationListenerService$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/service/notification/NotificationListenerService;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ble/MyNotificationListenerService;->X11iII1O1:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ble/MyNotificationListenerService;->XXX11i:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ble/MyNotificationListenerService;->X1IX:Ljava/lang/String;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ble/MyNotificationListenerService;->X0i1O:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ble/MyNotificationListenerService;->iIXi1iiXI:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ble/MyNotificationListenerService;->iXiX011:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final I0IIOi(Landroid/service/notification/StatusBarNotification;)V
    .locals 16

    invoke-virtual/range {p1 .. p1}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Notification;->getChannelId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getChannelId(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "voip_notification"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lkotlin/text/StringsKt__StringsKt;->iOiXX(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "MyNotificationListenerService sendNickNameToDevice -> voip_notification = false"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    if-eqz v0, :cond_2

    const-string v1, "android.title"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v7, v0

    goto :goto_2

    :cond_2
    :goto_1
    const-string v0, ""

    goto :goto_0

    :goto_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MyNotificationListenerService sendNickNameToDevice -> nickName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_3

    return-void

    :cond_3
    new-instance v1, Lcom/szabh/smable3/entity/BleNotification;

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/16 v2, 0xc

    const/4 v5, 0x0

    const-string v6, ""

    invoke-direct/range {v1 .. v9}, Lcom/szabh/smable3/entity/BleNotification;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyNotificationListenerService handleIncomingCall -> Send Notification = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v8, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v9, Lcom/szabh/smable3/BleKey;->NOTIFICATION:Lcom/szabh/smable3/BleKey;

    sget-object v10, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v14, 0x18

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v11, v1

    invoke-static/range {v8 .. v15}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void
.end method

.method public final IiI10X(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, ":"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p2, v0, v1, v2, v3}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, p2

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    move-object v4, v5

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const-string v5, ":"

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt__StringsKt;->OO1101010(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result p2

    invoke-virtual {v4, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    const-string v0, "substring(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, " @ "

    invoke-static {p1, v10, v1, v2, v3}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v5

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object v4, p1

    invoke-virtual {p2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v4, p2

    :goto_0
    new-instance v0, Lkotlin/Pair;

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final O00()Z
    .locals 1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XiX0I0()Z

    move-result v0

    return v0
.end method

.method public final OXO1([Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    if-eqz p1, :cond_0

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final XIi00iiXO(Landroid/app/Notification;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object p1, p1, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    if-eqz p1, :cond_6

    const-string v0, "android.textLines"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequenceArray(Ljava/lang/String;)[Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_6

    array-length v0, p1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_6

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x7151443d

    if-eq v0, v1, :cond_3

    const v1, -0x5c4004a1

    if-eq v0, v1, :cond_2

    const v1, 0xa20b87

    if-eq v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "com.twitter.android"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_1

    :cond_2
    const-string v0, "com.whatsapp"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_1

    :cond_3
    const-string v0, "com.zing.zalo"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    :cond_4
    invoke-static {p1}, Lkotlin/collections/ArraysKt___ArraysKt;->iXXX10([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "last(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/cp5;->OO(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_5
    :goto_1
    invoke-static {p1}, Lkotlin/collections/ArraysKt___ArraysKt;->IO0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "first(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/cp5;->OO(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_6
    const/4 p1, 0x0

    :goto_2
    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getTextlines -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-object p1
.end method

.method public final XO0O10(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "com.snapchat.android"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :sswitch_1
    const-string v0, "com.smile.gifmaker"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :sswitch_2
    const-string v0, "com.facebook.katana"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :sswitch_3
    const-string v0, "com.whatsapp"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/sma/smartv3/ble/MyNotificationListenerService;->X0i1O:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5c4004a1 -> :sswitch_3
        0x2a9664f1 -> :sswitch_2
        0x62e6cf33 -> :sswitch_1
        0x7cd40770 -> :sswitch_0
    .end sparse-switch
.end method

.method public final XOO0ii0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "com.google.android.gm"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p3, "\u00a0"

    const/4 p4, 0x0

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p2, p3, p4, v0, v1}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    const-string v3, "substring(...)"

    if-eqz v2, :cond_0

    filled-new-array {p3}, [Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p2

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v5, "\u00a0"

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt__StringsKt;->OO1101010(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result p2

    invoke-virtual {v4, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v4, p2

    const-string p2, "  "

    invoke-static {v4, p2, p4, v0, v1}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v5, "  "

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt__StringsKt;->OO1101010(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result p2

    invoke-virtual {v4, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v4, p2

    const-string p2, "com.whatsapp"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0, p1, v4}, Lcom/sma/smartv3/ble/MyNotificationListenerService;->IiI10X(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0, p1, v4}, Lcom/sma/smartv3/ble/MyNotificationListenerService;->IiI10X(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;

    move-result-object p1

    return-object p1

    :cond_3
    move-object p2, v4

    :goto_0
    new-instance p3, Lkotlin/Pair;

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3
.end method

.method public final iO(Ljava/lang/String;)Z
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ble/MyNotificationListenerService;->iIXi1iiXI:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Last push time: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " ,packageName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x258

    cmp-long p1, v1, v3

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onCreate()V
    .locals 4

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "MyNotificationListenerService onCreate"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lcom/szabh/smable3/music/MusicControllerCompat;->Companion:Lcom/szabh/smable3/music/MusicControllerCompat$Companion;

    invoke-virtual {v0}, Lcom/szabh/smable3/music/MusicControllerCompat$Companion;->newInstance()Lcom/szabh/smable3/music/MusicControllerCompat;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/szabh/smable3/music/MusicControllerCompat;->launch(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sma/smartv3/ble/MyNotificationListenerService;->I1:Lcom/szabh/smable3/music/MusicControllerCompat;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyNotificationListenerService MusicController launch error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "MyNotificationListenerService onDestroy"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ble/MyNotificationListenerService;->I1:Lcom/szabh/smable3/music/MusicControllerCompat;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/szabh/smable3/music/MusicControllerCompat;->exit()V

    :cond_0
    invoke-super {p0}, Landroid/service/notification/NotificationListenerService;->onDestroy()V

    return-void
.end method

.method public onListenerDisconnected()V
    .locals 2
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x18
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "MyNotificationListenerService onListenerDisconnected"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    new-instance v0, Landroid/content/ComponentName;

    const-class v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;

    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {v0}, Landroid/service/notification/NotificationListenerService;->requestRebind(Landroid/content/ComponentName;)V

    return-void
.end method

.method public onNotificationPosted(Landroid/service/notification/StatusBarNotification;)V
    .locals 32
    .param p1    # Landroid/service/notification/StatusBarNotification;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "notification_sms"

    const-string v3, "com.tencent.mm"

    const-string v4, "null"

    const-string v5, "com.android.email"

    const-string v6, ", "

    const-string v7, "com.android.mms"

    const-string v8, "com.whatsapp"

    const-string v9, "MyNotificationListenerService onNotificationPosted -> "

    const-string v10, "sbn"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p1}, Landroid/service/notification/NotificationListenerService;->onNotificationPosted(Landroid/service/notification/StatusBarNotification;)V

    :try_start_0
    sget-object v10, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v10}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result v10

    if-nez v10, :cond_0

    goto/16 :goto_b

    :cond_0
    sget-object v10, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v10}, Lcom/android/mltcode/paycertificationapi/q62;->I0IIOI()Z

    move-result v10

    if-nez v10, :cond_1

    goto/16 :goto_b

    :cond_1
    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/blankj/utilcode/util/AppUtils;->getAppName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    sget-object v11, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {v1}, Lcom/sma/smartv3/ble/MyNotificationListenerService;->O00()Z

    move-result v12

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getPackageName()Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v12, " "

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v11, v6}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getPackageName()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    goto/16 :goto_b

    :cond_2
    const-string v12, "shadowsocks"

    const/4 v13, 0x0

    const/4 v14, 0x2

    const/4 v15, 0x0

    invoke-static {v6, v12, v15, v14, v13}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    goto/16 :goto_b

    :cond_3
    sget-object v12, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v12}, Lcom/android/mltcode/paycertificationapi/i72;->I1()[Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v6}, Lkotlin/collections/ArraysKt___ArraysKt;->XOOOI0X([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v13, "notification_mirror_phone"

    const-string v14, "notification_"

    if-eqz v12, :cond_4

    :try_start_1
    sget-object v12, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v12}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v12

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_5

    goto/16 :goto_b

    :catch_0
    move-exception v0

    goto/16 :goto_a

    :cond_4
    sget-object v12, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v12}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v15

    move-object/from16 v19, v12

    const/4 v12, 0x0

    invoke-virtual {v15, v13, v12}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v15

    if-nez v15, :cond_5

    invoke-virtual/range {v19 .. v19}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v12

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_5

    goto/16 :goto_b

    :cond_5
    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getPostTime()J

    move-result-wide v14

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v12

    move-object/from16 v19, v9

    move-object/from16 v20, v10

    iget-wide v9, v12, Landroid/app/Notification;->when:J

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iX1O1()Ljava/text/SimpleDateFormat;

    move-result-object v12

    move-wide/from16 v21, v9

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v12, v9}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iX1O1()Ljava/text/SimpleDateFormat;

    move-result-object v10

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v12

    iget-object v12, v12, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    move-object/from16 v21, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v22, v7

    const-string v7, "MyNotificationListenerService onNotificationPosted -> postTime:"

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " when:"

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " sbn: "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ", notification.extras: "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v2

    iget-object v2, v2, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    if-eqz v2, :cond_7

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v7

    iget-object v7, v7, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    invoke-virtual {v7}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v10

    iget-object v10, v10, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    invoke-virtual {v10, v9}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Key = "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ", Value = "

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, "\n"

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_6
    sget-object v7, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "MyNotificationListenerService onNotificationPosted notification.extras -> "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    :cond_7
    invoke-virtual {v1}, Lcom/sma/smartv3/ble/MyNotificationListenerService;->O00()Z

    move-result v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v7, "com.google.android.gm"

    if-nez v2, :cond_a

    :try_start_2
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getId()I

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_b

    :cond_8
    iget-wide v9, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->IO:J

    cmp-long v2, v14, v9

    if-gtz v2, :cond_9

    goto/16 :goto_b

    :cond_9
    iput-wide v14, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->IO:J

    :cond_a
    const-string v2, "com.microsoft.office.outlook"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v9, 0x1

    if-eqz v2, :cond_b

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getId()I

    move-result v2

    if-eq v2, v9, :cond_b

    goto/16 :goto_b

    :cond_b
    const-string v2, "com.yahoo.mobile.client.android.mail"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3d

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    move-result-object v2

    const-string v10, "getTag(...)"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "summary"

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x2

    invoke-static {v2, v10, v9, v12, v11}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto/16 :goto_b

    :cond_c
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const-string v9, "getChannelId(...)"

    if-eqz v2, :cond_d

    :try_start_3
    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual/range {p0 .. p1}, Lcom/sma/smartv3/ble/MyNotificationListenerService;->I0IIOi(Landroid/service/notification/StatusBarNotification;)V

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Notification;->getChannelId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "voip_notification"

    move-wide/from16 v24, v14

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-static {v2, v10, v14, v12, v11}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto/16 :goto_b

    :cond_d
    move-wide/from16 v24, v14

    :cond_e
    const-string v2, "com.facebook.orca"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    if-eqz v2, :cond_f

    :try_start_4
    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v2

    iget-object v2, v2, Landroid/app/Notification;->category:Ljava/lang/String;

    const-string v10, "category"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v10

    const-string v11, "getDefault(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v10, "toLowerCase(...)"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "service"

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-static {v2, v10, v14, v12, v11}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    if-eqz v2, :cond_f

    goto/16 :goto_b

    :catch_1
    :cond_f
    :try_start_5
    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v10

    const/4 v14, 0x0

    invoke-virtual {v10, v13, v14}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    if-eqz v10, :cond_10

    const-string v10, "com.huawei.systemmanager"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_10

    goto/16 :goto_b

    :cond_10
    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v10

    iget-object v10, v10, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    const-string v11, "android.title"

    invoke-virtual {v10, v11}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v11

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    if-eqz v12, :cond_11

    if-nez v11, :cond_11

    goto/16 :goto_b

    :cond_11
    const-string v12, ""

    if-nez v11, :cond_12

    move-object v11, v12

    :cond_12
    :try_start_6
    invoke-virtual {v1}, Lcom/sma/smartv3/ble/MyNotificationListenerService;->O00()Z

    move-result v13

    if-eqz v13, :cond_13

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v13

    const-string v14, "getNotification(...)"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v13, v6}, Lcom/sma/smartv3/ble/MyNotificationListenerService;->XIi00iiXO(Landroid/app/Notification;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_13

    goto :goto_1

    :cond_13
    move-object v13, v12

    :goto_1
    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    move-result v14

    if-nez v14, :cond_17

    sget-object v13, Lcom/szabh/smable3/entity/BleNotification;->Companion:Lcom/szabh/smable3/entity/BleNotification$Companion;

    invoke-virtual {v13, v6}, Lcom/szabh/smable3/entity/BleNotification$Companion;->isEmail(Ljava/lang/String;)Z

    move-result v13
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    const-string v14, "android.text"

    if-eqz v13, :cond_15

    :try_start_7
    const-string v13, "android.bigText"

    invoke-virtual {v10, v13, v12}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v13

    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    move-result v15

    if-nez v15, :cond_14

    invoke-virtual {v10, v14, v12}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v13

    :cond_14
    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    move-result v14

    if-nez v14, :cond_16

    const-string v13, "android.subText"

    invoke-virtual {v10, v13, v12}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v13

    goto :goto_2

    :cond_15
    invoke-virtual {v10, v14, v12}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v13

    :cond_16
    :goto_2
    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move-object v14, v13

    const/4 v13, 0x0

    goto :goto_3

    :cond_17
    move-object v14, v13

    const/4 v13, 0x1

    :goto_3
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v15

    if-nez v15, :cond_18

    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v15

    if-nez v15, :cond_18

    goto/16 :goto_b

    :cond_18
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v26, v2

    const/4 v2, 0x1

    invoke-static {v15, v4, v2}, Lcom/android/mltcode/paycertificationapi/oe5;->OX0X1O10X(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_19

    goto/16 :goto_b

    :cond_19
    const-string v2, "\u6b63\u5728\u8fd0\u884c"

    move-object/from16 v27, v12

    move/from16 v23, v13

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/4 v15, 0x0

    invoke-static {v11, v2, v12, v13, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1a

    const-string v2, "\u77ed\u4fe1"

    invoke-static {v11, v2, v12, v13, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u9177\u72d7\u97f3\u4e50"

    invoke-static {v11, v2, v12, v13, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1a

    goto/16 :goto_b

    :cond_1a
    const-string v2, "QQ\u6b63\u5728\u540e\u53f0\u8fd0\u884c"

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    goto/16 :goto_b

    :cond_1b
    const-string v2, "com.viber.voip"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    const-string v2, "\u0412\u044b\u043f\u043e\u043b\u043d\u044f\u0435\u0442\u0441\u044f \u0432\u044b\u0437\u043e\u0432"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Call in progress"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u6b63\u5728\u901a\u8bdd\u4e2d"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Prob\u00edh\u00e1 hovor"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "A h\u00edv\u00e1s folyamatban"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Prebieha hovor"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Laufendes Gespr\u00e4ch"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Oproep gaande"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Puhelu k\u00e4ynniss\u00e4"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Samtal p\u00e5g\u00e5r"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Opkald i gang"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Appel en cours"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Samtale p\u00e5g\u00e5r"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Arama s\u00fcr\u00fcyor"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u901a\u8a71\u4e2d"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Chamada em curso"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Llamada en curso"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Chiamata in corso"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\ud1b5\ud654 \uc9c4\ud589 \uc911"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Persediaan sedang dijalankan"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    goto/16 :goto_b

    :cond_1c
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1d

    const-string v2, "\u8a9e\u97f3\u901a\u8a71\u4e2d\uff0c\u8f15\u89f8\u4ee5\u7e7c\u7e8c"

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u8bed\u97f3\u901a\u8bdd\u4e2d, \u8f7b\u51fb\u4ee5\u7ee7\u7eed"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Tap to continue as voice call in progress"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Ketuk untuk lanjut selama panggilan suara berlangsung"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Ketik untuk teruskan sebagai panggilan suara dalam perkembangan"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Toque para continuar mientras la llamada de voz est\u00e1 en curso"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\uc9c4\ud589 \uc911\uc778 \uc74c\uc131 \ud1b5\ud654\ub97c \uacc4\uc18d\ud558\ub824\uba74 \ub204\ub974\uc2ed\uc2dc\uc624"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Tocca per continuare quando \u00e8 in corso una chiamata voce"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u97f3\u58f0\u547c\u3073\u51fa\u3057\u4e2d\u306b\u30bf\u30c3\u30d7\u3057\u3066\u7d9a\u884c"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Toque para continuar enquanto a chamada de voz est\u00e1 em progresso"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u041d\u0430\u0436\u043c\u0438\u0442\u0435, \u0447\u0442\u043e\u0431\u044b \u043f\u0440\u043e\u0434\u043e\u043b\u0436\u0438\u0442\u044c, \u043f\u043e\u043a\u0430 \u0438\u0434\u0435\u0442 \u0433\u043e\u043b\u043e\u0441\u043e\u0432\u043e\u0439 \u0432\u044b\u0437\u043e\u0432"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u0e41\u0e15\u0e30\u0e40\u0e1e\u0e37\u0e48\u0e2d\u0e17\u0e33\u0e15\u0e48\u0e2d\u0e44\u0e1b \u0e02\u0e13\u0e30\u0e17\u0e35\u0e48\u0e42\u0e17\u0e23\u0e2a\u0e32\u0e22\u0e40\u0e2a\u0e35\u0e22\u0e07\u0e22\u0e31\u0e07\u0e43\u0e0a\u0e49\u0e07\u0e32\u0e19\u0e2d\u0e22\u0e39\u0e48"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Nh\u1ea5p \u0111\u1ec3 ti\u1ebfp t\u1ee5c v\u00ec cu\u1ed9c g\u1ecdi tho\u1ea1i \u0111ang di\u1ec5n ra"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u0627\u0644\u0645\u0633 \u0644\u0644\u0645\u062a\u0627\u0628\u0639\u0629 \u062d\u064a\u062b \u0625\u0646 \u0627\u0644\u0645\u0643\u0627\u0644\u0645\u0629 \u0627\u0644\u0635\u0648\u062a\u064a\u0629 \u062c\u0627\u0631\u064a\u0629"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Sesli arama s\u00fcrd\u00fc\u011f\u00fcnden devam etmek i\u00e7in dokunun"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Tippen, um w\u00e4hrend einem Sprachanruf fortzufahren"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Touchez pour continuer pendant l\'appel vocal"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u101c\u102f\u1015\u1039\u1031\u1006\u102c\u1004\u1039\u1031\u1014\u1005\u1025\u1039 \u1021\u101e\u1036\u1031\u1001\u105a\u1006\u102d\u102f\u1019\u1088\u1000\u1032\u1037\u101e\u102d\u102f\u1094\u1006\u1000\u1039\u101c\u102f\u1015\u1039\u101b\u1014\u1039\u108f\u103d\u102d\u1015\u1039\u1015\u102b"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u0ec1\u0e95\u0eb0\u200b\u0ec0\u0e9e\u0eb7\u0ec8\u0ead\u200b\u0eaa\u0eb7\u0e9a\u200b\u0e95\u0ecd\u0ec8\u0ec0\u0e9b\u0eb1\u0e99\u200b\u0e81\u0eb2\u0e99\u200b\u0ec2\u0e97\u200b\u0e94\u0ec9\u0ea7\u0e8d\u200b\u0eaa\u0ebd\u0e87\u200b\u0e9e\u0ea7\u0ea1\u200b\u0e94\u0eb3\u200b\u0ec0\u0e99\u0eb5\u0e99\u200b\u0ea2\u0eb9\u0ec8"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1d

    goto/16 :goto_b

    :cond_1d
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1e

    const-string v2, "\u30e1\u30fc\u30eb\u306e\u540c\u671f\u4e2d"

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1e

    goto/16 :goto_b

    :cond_1e
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1f

    const-string v2, "\u6b63\u5728\u53d1\u9001\u90ae\u4ef6..."

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static {v11, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Sending email\u2026"

    invoke-static {v11, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u30e1\u30fc\u30eb\u3092\u9001\u4fe1\u4e2d..."

    invoke-static {v11, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1f

    goto/16 :goto_b

    :cond_1f
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_20

    const-string v2, "\u6b63\u5728\u5c06\u89c6\u9891\u53d1\u9001\u7ed9"

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u6b63\u5728\u53d1\u9001\u6587\u4ef6\u7ed9"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u6b63\u5728\u53d1\u9001\u97f3\u9891\u6587\u4ef6\u7ed9"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Sending video to"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Sending file to"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Sending audio to"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u6b63\u5728\u50b3\u9001\u97f3\u8a0a\u6a94\u7d66"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u6b63\u5728\u50b3\u9001\u6587\u4ef6\u7d66"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u6b63\u5728\u50b3\u9001\u5f71\u7247\u7d66"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u306b\u30d5\u30a1\u30a4\u30eb\u3092\u9001\u4fe1\u4e2d"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u30d3\u30c7\u30aa\u3092\u9001\u4fe1\u4e2d"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "\u306b\u97f3\u58f0\u3092\u9001\u4fe1\u4e2d"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Envoi du fichier \u00e0"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Envoi du fichier audio \u00e0"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    const-string v2, "Envoi de la vid\u00e9o \u00e0"

    invoke-static {v14, v2, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_20

    goto/16 :goto_b

    :cond_20
    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Notification;->getChannelId()Ljava/lang/String;

    move-result-object v2

    const-string v5, "com.miui.player:remote-notification"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_21

    goto/16 :goto_b

    :cond_21
    invoke-virtual {v1}, Lcom/sma/smartv3/ble/MyNotificationListenerService;->O00()Z

    move-result v2

    if-nez v2, :cond_23

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->ii0111XI()Z

    move-result v2

    if-eqz v2, :cond_23

    iget-object v2, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->X11iII1O1:Ljava/lang/String;

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_22

    iget-wide v12, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->iX1O1:J

    const-wide/16 v28, 0x0

    cmp-long v2, v12, v28

    if-eqz v2, :cond_22

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    move-wide/from16 v28, v12

    iget-wide v12, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->iX1O1:J

    sub-long v12, v28, v12

    const-wide/16 v28, 0x1f4

    cmp-long v2, v12, v28

    if-gtz v2, :cond_22

    goto/16 :goto_b

    :cond_22
    iput-object v6, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->X11iII1O1:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    iput-wide v12, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->iX1O1:J

    :cond_23
    invoke-virtual/range {v26 .. v26}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v5, "IS_CALL_NOTIFICATION_RECEIVE"

    const/4 v13, 0x0

    invoke-virtual {v2, v5, v13}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    const-string v5, "com.google.android.apps.tachyon"

    if-eqz v2, :cond_24

    :try_start_8
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3d

    invoke-virtual/range {v26 .. v26}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v2, "notification_call"

    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3d

    new-instance v12, Lcom/szabh/smable3/entity/BleNotification;

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v14

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v17

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    const v2, 0x7f140d10

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "getString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v19, 0x4

    const/16 v20, 0x0

    const/4 v13, 0x1

    const/16 v16, 0x0

    move-object/from16 v18, v0

    invoke-direct/range {v12 .. v20}, Lcom/szabh/smable3/entity/BleNotification;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onNotificationPosted handleIncomingCall -> Send Notification = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    move-object v15, v12

    sget-object v12, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v13, Lcom/szabh/smable3/BleKey;->NOTIFICATION:Lcom/szabh/smable3/BleKey;

    sget-object v14, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v18, 0x18

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v12 .. v19}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    move-object v12, v15

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/16 v19, 0x1b

    const/16 v20, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v6

    invoke-static/range {v12 .. v20}, Lcom/szabh/smable3/entity/BleNotification;->copy$default(Lcom/szabh/smable3/entity/BleNotification;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleNotification;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/initializer/BleInitializer;->OiXI1OiX0(Lcom/szabh/smable3/entity/BleNotification;)V

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_b

    :cond_24
    move-object v2, v6

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_26

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Notification;->getChannelId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "call_notifications"

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static {v5, v6, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_25

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {v0}, Lcom/sma/smartv3/initializer/BleInitializer;->I0XXi0X()Lcom/szabh/smable3/entity/BleNotification;

    move-result-object v3

    if-nez v3, :cond_3d

    new-instance v12, Lcom/szabh/smable3/entity/BleNotification;

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v18

    const/16 v13, 0x7f

    move-object/from16 v16, v2

    move-wide v14, v3

    invoke-direct/range {v12 .. v18}, Lcom/szabh/smable3/entity/BleNotification;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Lcom/sma/smartv3/initializer/BleInitializer;->OiXI1OiX0(Lcom/szabh/smable3/entity/BleNotification;)V

    goto/16 :goto_b

    :cond_25
    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Notification;->getChannelId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "missed_calls"

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static {v5, v6, v13, v12, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_26

    goto/16 :goto_b

    :cond_26
    sget-object v12, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v5, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {v5}, Lcom/sma/smartv3/initializer/BleInitializer;->XOXOIX0Oi()Z

    move-result v6

    invoke-virtual {v5}, Lcom/sma/smartv3/initializer/BleInitializer;->iIIIiIO0()Z

    move-result v7

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "MyNotificationListenerService onNotificationPosted ->packageName = "

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v15, " , isSendMissedCall = "

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v6, " , isSmsNotificationReceive = "

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v6, " , title = "

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " , content = "

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v12, v6}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_27

    const-string v6, "org.telegram.messenger"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_27

    goto/16 :goto_b

    :cond_27
    const-string v6, "android"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3d

    const-string v6, "com.android.systemui"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3d

    const-string v6, "com.xiaomi.simactivate.service"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3d

    const-string v6, "com.miui.smsextra"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3d

    const-string v6, "Com.android.deskclock"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_28

    goto/16 :goto_b

    :cond_28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v5}, Lcom/sma/smartv3/initializer/BleInitializer;->IOi1O0()J

    move-result-wide v28

    sub-long v6, v6, v28

    move-object/from16 v13, v22

    invoke-static {v2, v13}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    move-wide/from16 v28, v6

    const-string v6, "com.samsung.android.messaging"

    const-string v7, "com.google.android.apps.messaging"

    if-nez v15, :cond_2a

    :try_start_9
    const-string v15, "com.android.mms.service"

    invoke-static {v2, v15}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_2a

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_2a

    const-string v15, "com.oneplus.mms"

    invoke-static {v2, v15}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_2a

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_29

    goto :goto_4

    :cond_29
    move-object/from16 v31, v8

    move-object/from16 v30, v10

    move-object/from16 v22, v11

    goto :goto_5

    :cond_2a
    :goto_4
    const-string v15, "Tap for more information or to stop the app"

    move-object/from16 v31, v8

    move-object/from16 v30, v10

    move-object/from16 v22, v11

    const/4 v8, 0x0

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static {v14, v15, v8, v10, v11}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_2b

    goto/16 :goto_b

    :cond_2b
    invoke-virtual {v5}, Lcom/sma/smartv3/initializer/BleInitializer;->iIIIiIO0()Z

    move-result v8

    if-eqz v8, :cond_2c

    const-wide/16 v10, 0x2710

    cmp-long v8, v28, v10

    if-gez v8, :cond_2c

    goto/16 :goto_b

    :cond_2c
    const/4 v8, 0x0

    invoke-virtual {v5, v8}, Lcom/sma/smartv3/initializer/BleInitializer;->IIO11(Z)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    invoke-virtual {v5, v10, v11}, Lcom/sma/smartv3/initializer/BleInitializer;->I11iXOO(J)V

    :goto_5
    const-string v8, "com.android.incallui"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2d

    const-string v8, "com.android.server.telecom"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2d

    const-string v8, "com.google.android.dialer"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2d

    const-string v8, "com.samsung.android.incallui"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2d

    const-string v8, "com.samsung.android.dialer"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2d

    const-string v8, "com.oneplus.dialer"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_31

    :cond_2d
    invoke-virtual {v5}, Lcom/sma/smartv3/initializer/BleInitializer;->XOXOIX0Oi()Z

    move-result v8

    if-eqz v8, :cond_2e

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->XXX11i:Ljava/lang/String;

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->X1IX:Ljava/lang/String;

    const/4 v13, 0x0

    invoke-virtual {v5, v13}, Lcom/sma/smartv3/initializer/BleInitializer;->XX00XX(Z)V

    goto/16 :goto_b

    :cond_2e
    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Notification;->getChannelId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "MiuiTelecomMissedCalls"

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v15, 0x0

    invoke-static {v5, v8, v11, v10, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2f

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v8, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->XXX11i:Ljava/lang/String;

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2f

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v8, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->X1IX:Ljava/lang/String;

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2f

    goto/16 :goto_b

    :cond_2f
    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Notification;->getChannelId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "phone_ongoing_call"

    const/4 v8, 0x0

    const/4 v10, 0x2

    const/4 v15, 0x0

    invoke-static {v0, v5, v8, v10, v15}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_30

    goto/16 :goto_b

    :cond_30
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->XXX11i:Ljava/lang/String;

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->X1IX:Ljava/lang/String;

    :cond_31
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_32

    move-object v6, v13

    goto :goto_6

    :cond_32
    move-object v6, v2

    :goto_6
    invoke-static {v6, v13}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_33

    invoke-virtual/range {v26 .. v26}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    move-object/from16 v2, v21

    const/4 v13, 0x0

    invoke-virtual {v0, v2, v13}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_33

    invoke-virtual/range {v26 .. v26}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, v2, v13}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyNotificationListenerService  NOTIFICATION_SMS = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto/16 :goto_b

    :cond_33
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_35

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_34

    goto :goto_7

    :cond_34
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_35

    :goto_7
    const-string v11, "Messages"

    goto :goto_8

    :cond_35
    move-object/from16 v11, v22

    :goto_8
    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/wx/WxManager;->O0O0X0iOi()Z

    move-result v0

    if-eqz v0, :cond_36

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_36

    const-string v0, "MyNotificationListenerService WxNotificationServerEnable"

    invoke-virtual {v12, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto/16 :goto_b

    :cond_36
    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->OXO1:Lcom/sma/smartv3/biz/wa/WAManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/wa/WAManager;->X100O()Z

    move-result v0

    if-eqz v0, :cond_37

    move-object/from16 v0, v31

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_37

    const-string v0, "MyNotificationListenerService WANotificationServerEnable"

    invoke-virtual {v12, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto/16 :goto_b

    :cond_37
    new-instance v5, Lcom/szabh/smable3/entity/BleNotification;

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    const/16 v3, 0x7f

    move-object v2, v5

    move-wide/from16 v4, v24

    invoke-direct/range {v2 .. v8}, Lcom/szabh/smable3/entity/BleNotification;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v5, v2

    move-object v13, v6

    invoke-virtual {v1}, Lcom/sma/smartv3/ble/MyNotificationListenerService;->O00()Z

    move-result v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    const-string v2, " Send Notification = "

    if-eqz v0, :cond_3c

    :try_start_a
    invoke-virtual {v1, v13}, Lcom/sma/smartv3/ble/MyNotificationListenerService;->iO(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3b

    if-eqz v23, :cond_39

    const-string v0, "android.textLines"

    move-object/from16 v3, v30

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getCharSequenceArray(Ljava/lang/String;)[Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/ble/MyNotificationListenerService;->OXO1([Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->iXiX011:Ljava/util/Map;

    invoke-interface {v3, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_38

    const-string v0, "MyNotificationListenerService onNotificationPosted -> repeat textline"

    invoke-virtual {v12, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->iIXi1iiXI:Ljava/util/Map;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_b

    :cond_38
    iget-object v3, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->iXiX011:Ljava/util/Map;

    invoke-interface {v3, v13, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleNotification;->getMTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleNotification;->getMContent()Ljava/lang/String;

    move-result-object v3

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move-object/from16 v4, v20

    invoke-virtual {v1, v0, v3, v13, v4}, Lcom/sma/smartv3/ble/MyNotificationListenerService;->XOO0ii0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v5, v3}, Lcom/szabh/smable3/entity/BleNotification;->setMTitle(Ljava/lang/String;)V

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v5, v3}, Lcom/szabh/smable3/entity/BleNotification;->setMContent(Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MyNotificationListenerService onNotificationPosted -> new content "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_39
    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleNotification;->getMTitle()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[\\s]"

    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleNotification;->getMContent()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    move-object/from16 v4, v27

    invoke-virtual {v3, v4}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v13, v0}, Lcom/sma/smartv3/ble/MyNotificationListenerService;->XO0O10(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3a

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v4, v19

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v6, v23

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->NOTIFICATION:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    iget-object v2, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->X0i1O:Ljava/util/Map;

    invoke-interface {v2, v13, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v1, Lcom/sma/smartv3/ble/MyNotificationListenerService;->iIXi1iiXI:Ljava/util/Map;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :cond_3a
    const-string v0, "MyNotificationListenerService onNotificationPosted -> isRepeated"

    invoke-virtual {v12, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto :goto_9

    :cond_3b
    const-string v0, "MyNotificationListenerService onNotificationPosted -> in interval time"

    invoke-virtual {v12, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :goto_9
    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_b

    :cond_3c
    move-object/from16 v4, v19

    move/from16 v6, v23

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->NOTIFICATION:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    goto :goto_b

    :goto_a
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3d
    :goto_b
    return-void
.end method

.method public onNotificationRemoved(Landroid/service/notification/StatusBarNotification;)V
    .locals 0
    .param p1    # Landroid/service/notification/StatusBarNotification;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method
