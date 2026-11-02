.class public final Lcom/sma/smartv3/ui/main/PurchaseTipsActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPurchaseTipsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseTipsActivity.kt\ncom/sma/smartv3/ui/main/PurchaseTipsActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n69#2,3:45\n72#2,5:49\n1#3:48\n*S KotlinDebug\n*F\n+ 1 PurchaseTipsActivity.kt\ncom/sma/smartv3/ui/main/PurchaseTipsActivity\n*L\n38#1:45,3\n38#1:49,5\n38#1:48\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPurchaseTipsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseTipsActivity.kt\ncom/sma/smartv3/ui/main/PurchaseTipsActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n69#2,3:45\n72#2,5:49\n1#3:48\n*S KotlinDebug\n*F\n+ 1 PurchaseTipsActivity.kt\ncom/sma/smartv3/ui/main/PurchaseTipsActivity\n*L\n38#1:45,3\n38#1:49,5\n38#1:48\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    return-void
.end method

.method private final toMain()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/main/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "ALREADY_LOGIN"

    invoke-static {v2, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method


# virtual methods
.method public final confirmClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/PurchaseTipsActivity;->toMain()V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 0

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00e3

    return v0
.end method

.method public final noRemindClick(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "SHOW_PURCHASE_TIP"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/PurchaseTipsActivity;->toMain()V

    return-void
.end method
