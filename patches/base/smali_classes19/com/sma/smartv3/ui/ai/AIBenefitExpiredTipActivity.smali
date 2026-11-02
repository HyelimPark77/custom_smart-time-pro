.class public final Lcom/sma/smartv3/ui/ai/AIBenefitExpiredTipActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAIBenefitExpiredTipActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIBenefitExpiredTipActivity.kt\ncom/sma/smartv3/ui/ai/AIBenefitExpiredTipActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n87#2,7:32\n94#2,3:40\n70#2,7:43\n97#2:50\n1#3:39\n*S KotlinDebug\n*F\n+ 1 AIBenefitExpiredTipActivity.kt\ncom/sma/smartv3/ui/ai/AIBenefitExpiredTipActivity\n*L\n27#1:32,7\n27#1:40,3\n27#1:43,7\n27#1:50\n27#1:39\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAIBenefitExpiredTipActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIBenefitExpiredTipActivity.kt\ncom/sma/smartv3/ui/ai/AIBenefitExpiredTipActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n87#2,7:32\n94#2,3:40\n70#2,7:43\n97#2:50\n1#3:39\n*S KotlinDebug\n*F\n+ 1 AIBenefitExpiredTipActivity.kt\ncom/sma/smartv3/ui/ai/AIBenefitExpiredTipActivity\n*L\n27#1:32,7\n27#1:40,3\n27#1:43,7\n27#1:50\n27#1:39\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
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

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->transparentNavBar()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->transparentStatusBar()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0024

    return v0
.end method

.method public final onBenefitExpiredBtn(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {p1, v1, v1, v0, v1}, Lcom/sma/smartv3/biz/OrderManager;->X11iII1O1(Lcom/sma/smartv3/biz/OrderManager;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    invoke-virtual {v0, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mArg1"

    const/4 v2, 0x2

    invoke-virtual {v0, p1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
