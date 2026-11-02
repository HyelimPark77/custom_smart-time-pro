.class public final Lcom/sma/smartv3/ui/order/PointsRechargeActivity$OXO1;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPointsRechargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity$initView$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,309:1\n87#2,7:310\n94#2,3:318\n70#2,7:321\n97#2:328\n1#3:317\n*S KotlinDebug\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity$initView$1\n*L\n101#1:310,7\n101#1:318,3\n101#1:321,7\n101#1:328\n101#1:317\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPointsRechargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity$initView$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,309:1\n87#2,7:310\n94#2,3:318\n70#2,7:321\n97#2:328\n1#3:317\n*S KotlinDebug\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity$initView$1\n*L\n101#1:310,7\n101#1:318,3\n101#1:321,7\n101#1:328\n101#1:317\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/order/PointsRechargeActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$OXO1;->IO:Lcom/sma/smartv3/ui/order/PointsRechargeActivity;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$OXO1;->IO:Lcom/sma/smartv3/ui/order/PointsRechargeActivity;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i72;->iOO1ii1(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://api.iot-solution.net/web/cn/smart_time_pro/webs/points_agreement.html?lang="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v2, 0x2

    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/sma/smartv3/ui/me/WebViewActivity;

    invoke-direct {v0, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    const-string v0, "paint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0xffff01

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    return-void
.end method
