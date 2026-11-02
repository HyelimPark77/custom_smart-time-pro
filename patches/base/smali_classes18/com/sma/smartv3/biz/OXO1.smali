.class public final Lcom/sma/smartv3/biz/OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/OXO1$OXO1;
    }
.end annotation


# static fields
.field public static final I0IIOi:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Lcom/sma/smartv3/biz/OXO1;",
            ">;"
        }
    .end annotation
.end field

.field public static final XOO0ii0:Lcom/sma/smartv3/biz/OXO1$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field public IiI10X:Landroidx/core/app/NotificationManagerCompat;

.field public O00:Landroid/widget/RemoteViews;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public OXO1:Landroid/app/Application;

.field public XIi00iiXO:I

.field public XO0O10:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/biz/OXO1$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/biz/OXO1$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/biz/OXO1;->XOO0ii0:Lcom/sma/smartv3/biz/OXO1$OXO1;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/en4;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/en4;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/OXO1;->I0IIOi:Lkotlin/Lazy;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lkotlin/ranges/IntRange;

    const/16 v1, 0x64

    const v2, 0x7fffffff

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    sget-object v1, Lkotlin/random/Random;->Default:Lkotlin/random/Random$Default;

    invoke-static {v0, v1}, Lkotlin/ranges/iO;->IOIi00(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/biz/OXO1;->XIi00iiXO:I

    const-string v0, "com.sma.smartv3.pro"

    iput-object v0, p0, Lcom/sma/smartv3/biz/OXO1;->iO:Ljava/lang/String;

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getAppName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/biz/OXO1;->XO0O10:Ljava/lang/String;

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/biz/OXO1;IILjava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const-string p3, ""

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/OXO1;->X0O(IILjava/lang/String;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/biz/OXO1;Ljava/lang/String;ILjava/lang/Object;)Landroid/app/Notification;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/OXO1;->XO0O10(Ljava/lang/String;)Landroid/app/Notification;

    move-result-object p0

    return-object p0
.end method

.method public static final OIi0()Lcom/sma/smartv3/biz/OXO1;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/biz/OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/OXO1;-><init>()V

    return-object v0
.end method

.method public static synthetic OXO1()Lcom/sma/smartv3/biz/OXO1;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/biz/OXO1;->OIi0()Lcom/sma/smartv3/biz/OXO1;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic XIi00iiXO()Lkotlin/Lazy;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/OXO1;->I0IIOi:Lkotlin/Lazy;

    return-object v0
.end method

.method public static final iO()Lcom/sma/smartv3/biz/OXO1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/OXO1;->XOO0ii0:Lcom/sma/smartv3/biz/OXO1$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OXO1$OXO1;->OXO1()Lcom/sma/smartv3/biz/OXO1;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final I0IIOi(Landroid/app/Application;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/OXO1;->OXO1:Landroid/app/Application;

    if-nez p1, :cond_0

    const-string p1, "mApp"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-static {p1}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object p1

    const-string v0, "from(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/OXO1;->IiI10X:Landroidx/core/app/NotificationManagerCompat;

    return-void
.end method

.method public final I0iXXO()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->Oii1X1iO()Z

    move-result v0

    if-eqz v0, :cond_0

    const-class v0, Lcom/sma/smartv3/biz/LocalServiceV2;

    goto :goto_0

    :cond_0
    const-class v0, Lcom/sma/smartv3/biz/LocalService;

    :goto_0
    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->isServiceRunning(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "SmaNotification startService isServiceRunning"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/sma/smartv3/biz/OXO1;->OXO1:Landroid/app/Application;

    const/4 v3, 0x0

    const-string v4, "mApp"

    if-nez v2, :cond_2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_2
    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/OXO1;->OXO1:Landroid/app/Application;

    if-nez v0, :cond_3

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v3, v0

    :goto_1
    invoke-virtual {v3, v1}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public final IO(Landroid/app/Service;)V
    .locals 3
    .param p1    # Landroid/app/Service;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "service"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "showNotification"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, v1, v0, v1}, Lcom/sma/smartv3/biz/OXO1;->O00(Lcom/sma/smartv3/biz/OXO1;Ljava/lang/String;ILjava/lang/Object;)Landroid/app/Notification;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/biz/OXO1;->IiI10X:Landroidx/core/app/NotificationManagerCompat;

    if-nez v2, :cond_0

    const-string v2, "mManagerCompat"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    move-object v1, v2

    :goto_0
    iget v2, p0, Lcom/sma/smartv3/biz/OXO1;->XIi00iiXO:I

    invoke-virtual {v1, v2, v0}, Landroidx/core/app/NotificationManagerCompat;->notify(ILandroid/app/Notification;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v1, v2, :cond_1

    iget v1, p0, Lcom/sma/smartv3/biz/OXO1;->XIi00iiXO:I

    const/16 v2, 0x8

    invoke-static {p1, v1, v0, v2}, Landroidx/core/app/ServiceCompat;->startForeground(Landroid/app/Service;ILandroid/app/Notification;I)V

    return-void

    :cond_1
    iget v1, p0, Lcom/sma/smartv3/biz/OXO1;->XIi00iiXO:I

    invoke-virtual {p1, v1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public final IiI10X(Landroid/app/Service;)V
    .locals 3
    .param p1    # Landroid/app/Service;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "service"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "hideNotification"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, v1, v0, v1}, Lcom/sma/smartv3/biz/OXO1;->O00(Lcom/sma/smartv3/biz/OXO1;Ljava/lang/String;ILjava/lang/Object;)Landroid/app/Notification;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/biz/OXO1;->IiI10X:Landroidx/core/app/NotificationManagerCompat;

    if-nez v2, :cond_0

    const-string v2, "mManagerCompat"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    move-object v1, v2

    :goto_0
    iget v2, p0, Lcom/sma/smartv3/biz/OXO1;->XIi00iiXO:I

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationManagerCompat;->cancel(I)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v1, v2, :cond_1

    iget v1, p0, Lcom/sma/smartv3/biz/OXO1;->XIi00iiXO:I

    const/16 v2, 0x8

    invoke-static {p1, v1, v0, v2}, Landroidx/core/app/ServiceCompat;->startForeground(Landroid/app/Service;ILandroid/app/Notification;I)V

    return-void

    :cond_1
    iget v1, p0, Lcom/sma/smartv3/biz/OXO1;->XIi00iiXO:I

    invoke-virtual {p1, v1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public final O10IXXX0X(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/sma/smartv3/biz/LocalService;

    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->isServiceRunning(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/OXO1;->IiI10X:Landroidx/core/app/NotificationManagerCompat;

    if-nez v0, :cond_1

    const-string v0, "mManagerCompat"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    iget v1, p0, Lcom/sma/smartv3/biz/OXO1;->XIi00iiXO:I

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/OXO1;->XO0O10(Ljava/lang/String;)Landroid/app/Notification;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/core/app/NotificationManagerCompat;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public final OIX0iXi(Landroid/app/Service;)V
    .locals 3
    .param p1    # Landroid/app/Service;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "service"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "showNotificationV2"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, v1, v0, v1}, Lcom/sma/smartv3/biz/OXO1;->O00(Lcom/sma/smartv3/biz/OXO1;Ljava/lang/String;ILjava/lang/Object;)Landroid/app/Notification;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/biz/OXO1;->IiI10X:Landroidx/core/app/NotificationManagerCompat;

    if-nez v2, :cond_0

    const-string v2, "mManagerCompat"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    move-object v1, v2

    :goto_0
    iget v2, p0, Lcom/sma/smartv3/biz/OXO1;->XIi00iiXO:I

    invoke-virtual {v1, v2, v0}, Landroidx/core/app/NotificationManagerCompat;->notify(ILandroid/app/Notification;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v1, v2, :cond_1

    iget v1, p0, Lcom/sma/smartv3/biz/OXO1;->XIi00iiXO:I

    const/16 v2, 0x18

    invoke-static {p1, v1, v0, v2}, Landroidx/core/app/ServiceCompat;->startForeground(Landroid/app/Service;ILandroid/app/Notification;I)V

    return-void

    :cond_1
    iget v1, p0, Lcom/sma/smartv3/biz/OXO1;->XIi00iiXO:I

    invoke-virtual {p1, v1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public final X0O(IILjava/lang/String;)V
    .locals 5
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "distance"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/sma/smartv3/biz/LocalService;

    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->isServiceRunning(Ljava/lang/Class;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateSportData -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const v1, 0x7f140274

    const/4 v2, 0x0

    const-string v3, "mApp"

    const-string v4, " "

    if-lez v0, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/biz/OXO1;->OXO1:Landroid/app/Application;

    if-nez p1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_1
    iget-object p3, p0, Lcom/sma/smartv3/biz/OXO1;->OXO1:Landroid/app/Application;

    if-nez p3, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p3, v2

    :cond_2
    const v0, 0x7f1412c6

    invoke-virtual {p3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    iget-object v0, p0, Lcom/sma/smartv3/biz/OXO1;->OXO1:Landroid/app/Application;

    if-nez v0, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v2, v0

    :goto_1
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "  "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/OXO1;->O10IXXX0X(Ljava/lang/String;)V

    return-void
.end method

.method public final X1ii(Landroid/widget/RemoteViews;)V
    .locals 3
    .param p1    # Landroid/widget/RemoteViews;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "remoteViews"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/sma/smartv3/biz/LocalService;

    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->isServiceRunning(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/sma/smartv3/biz/OXO1;->O00:Landroid/widget/RemoteViews;

    iget-object p1, p0, Lcom/sma/smartv3/biz/OXO1;->IiI10X:Landroidx/core/app/NotificationManagerCompat;

    const/4 v0, 0x0

    if-nez p1, :cond_1

    const-string p1, "mManagerCompat"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    iget v1, p0, Lcom/sma/smartv3/biz/OXO1;->XIi00iiXO:I

    const/4 v2, 0x1

    invoke-static {p0, v0, v2, v0}, Lcom/sma/smartv3/biz/OXO1;->O00(Lcom/sma/smartv3/biz/OXO1;Ljava/lang/String;ILjava/lang/Object;)Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroidx/core/app/NotificationManagerCompat;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public final XO0O10(Ljava/lang/String;)Landroid/app/Notification;
    .locals 7

    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v1, p0, Lcom/sma/smartv3/biz/OXO1;->OXO1:Landroid/app/Application;

    const-string v2, "mApp"

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_0
    iget-object v4, p0, Lcom/sma/smartv3/biz/OXO1;->iO:Ljava/lang/String;

    invoke-direct {v0, v1, v4}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const v1, 0x7f10003b

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/biz/OXO1;->OXO1:Landroid/app/Application;

    if-nez v1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_1
    iget-object v4, p0, Lcom/sma/smartv3/biz/OXO1;->OXO1:Landroid/app/Application;

    if-nez v4, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_2
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/blankj/utilcode/util/IntentUtils;->getLaunchAppIntent(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    const/high16 v5, 0x4000000

    const/4 v6, 0x0

    invoke-static {v1, v6, v4, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroidx/core/app/NotificationCompat$Builder;->setSound(Landroid/net/Uri;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroidx/core/app/NotificationCompat$Builder;->setVibrate([J)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v6, v6, v6}, Landroidx/core/app/NotificationCompat$Builder;->setLights(III)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setVisibility(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/biz/OXO1;->O00:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContent(Landroid/widget/RemoteViews;)Landroidx/core/app/NotificationCompat$Builder;

    :cond_3
    if-eqz p1, :cond_5

    iget-object v1, p0, Lcom/sma/smartv3/biz/OXO1;->OXO1:Landroid/app/Application;

    if-nez v1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_4
    const v2, 0x7f140142

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v0, p1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    :cond_5
    invoke-virtual {v0, v3}, Landroidx/core/app/NotificationCompat$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    const-string v0, "build(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/app/NotificationChannel;

    iget-object v1, p0, Lcom/sma/smartv3/biz/OXO1;->iO:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/biz/OXO1;->XO0O10:Ljava/lang/String;

    const/4 v4, 0x2

    invoke-direct {v0, v1, v2, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->Oii1X1iO()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/sma/smartv3/biz/OXO1;->IiI10X:Landroidx/core/app/NotificationManagerCompat;

    if-nez v1, :cond_6

    const-string v1, "mManagerCompat"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    move-object v3, v1

    :goto_0
    invoke-virtual {v3, v0}, Landroidx/core/app/NotificationManagerCompat;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_7
    return-object p1
.end method

.method public final XOO0ii0(Landroid/app/Service;)V
    .locals 3
    .param p1    # Landroid/app/Service;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "service"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "hideNotificationV2"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, v1, v0, v1}, Lcom/sma/smartv3/biz/OXO1;->O00(Lcom/sma/smartv3/biz/OXO1;Ljava/lang/String;ILjava/lang/Object;)Landroid/app/Notification;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/biz/OXO1;->IiI10X:Landroidx/core/app/NotificationManagerCompat;

    if-nez v2, :cond_0

    const-string v2, "mManagerCompat"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    move-object v1, v2

    :goto_0
    iget v2, p0, Lcom/sma/smartv3/biz/OXO1;->XIi00iiXO:I

    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationManagerCompat;->cancel(I)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v1, v2, :cond_1

    iget v1, p0, Lcom/sma/smartv3/biz/OXO1;->XIi00iiXO:I

    const/16 v2, 0x18

    invoke-static {p1, v1, v0, v2}, Landroidx/core/app/ServiceCompat;->startForeground(Landroid/app/Service;ILandroid/app/Notification;I)V

    return-void

    :cond_1
    iget v1, p0, Lcom/sma/smartv3/biz/OXO1;->XIi00iiXO:I

    invoke-virtual {p1, v1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public final XXI()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "stopService LocalService"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->Oii1X1iO()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "mApp"

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/biz/OXO1;->OXO1:Landroid/app/Application;

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    new-instance v3, Landroid/content/Intent;

    iget-object v4, p0, Lcom/sma/smartv3/biz/OXO1;->OXO1:Landroid/app/Application;

    if-nez v4, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v4

    :goto_0
    const-class v2, Lcom/sma/smartv3/biz/LocalServiceV2;

    invoke-direct {v3, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v3}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    return-void

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/biz/OXO1;->OXO1:Landroid/app/Application;

    if-nez v0, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_3
    new-instance v3, Landroid/content/Intent;

    iget-object v4, p0, Lcom/sma/smartv3/biz/OXO1;->OXO1:Landroid/app/Application;

    if-nez v4, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v1, v4

    :goto_1
    const-class v2, Lcom/sma/smartv3/biz/LocalService;

    invoke-direct {v3, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v3}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    return-void
.end method
