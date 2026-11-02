.class public final Lcom/sma/smartv3/util/PopManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPopManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopManager.kt\ncom/sma/smartv3/util/PopManager\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n87#2,7:153\n94#2,3:161\n70#2,7:164\n97#2:171\n1#3:160\n*S KotlinDebug\n*F\n+ 1 PopManager.kt\ncom/sma/smartv3/util/PopManager\n*L\n55#1:153,7\n55#1:161,3\n55#1:164,7\n55#1:171\n55#1:160\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPopManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopManager.kt\ncom/sma/smartv3/util/PopManager\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n87#2,7:153\n94#2,3:161\n70#2,7:164\n97#2:171\n1#3:160\n*S KotlinDebug\n*F\n+ 1 PopManager.kt\ncom/sma/smartv3/util/PopManager\n*L\n55#1:153,7\n55#1:161,3\n55#1:164,7\n55#1:171\n55#1:160\n*E\n"
    }
.end annotation


# static fields
.field public static final OXO1:Lcom/sma/smartv3/util/PopManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/util/PopManager;

    invoke-direct {v0}, Lcom/sma/smartv3/util/PopManager;-><init>()V

    sput-object v0, Lcom/sma/smartv3/util/PopManager;->OXO1:Lcom/sma/smartv3/util/PopManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic I0IIOi(Landroidx/appcompat/app/AppCompatActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/util/PopManager;->iIiiO(Landroidx/appcompat/app/AppCompatActivity;)Z

    move-result p0

    return p0
.end method

.method public static final I1(Lcom/android/mltcode/paycertificationapi/z16;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/android/mltcode/paycertificationapi/z16;->XiOIO(Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic IO(Lcom/sma/smartv3/util/PopManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/PopManager;->OIX0iXi(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Landroid/app/Activity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/util/PopManager;->O10IXXX0X(Landroid/app/Activity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic O00()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/util/PopManager;->XiOIO()Z

    move-result v0

    return v0
.end method

.method public static final O10IXXX0X(Landroid/app/Activity;)Z
    .locals 3

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/lp4;->OXO1()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/yy5;->OXO1:Lcom/android/mltcode/paycertificationapi/yy5;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/yy5;->OIX0iXi(Lcom/android/mltcode/paycertificationapi/yy5;Landroid/app/Activity;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final OII(Ljava/lang/String;Landroid/widget/CompoundButton;Z)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "isChecked = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {p1, p0, p2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic OIi0(Landroidx/appcompat/app/AppCompatActivity;Lcom/android/mltcode/paycertificationapi/go0;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/util/PopManager;->XX0(Landroidx/appcompat/app/AppCompatActivity;Lcom/android/mltcode/paycertificationapi/go0;Landroid/view/View;)V

    return-void
.end method

.method public static final OX(Landroidx/appcompat/app/AppCompatActivity;Lcom/android/mltcode/paycertificationapi/lu5;Landroid/view/View;)V
    .locals 3

    sget-object p2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p2, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p2, "2"

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/q62;->X0100I()Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "3"

    goto :goto_0

    :cond_1
    const-string p2, "1"

    :goto_0
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/lu5;->OIX0iXi()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://api.iot-solution.net/videoPlayer/?type="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "&id="

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/sma/smartv3/ui/me/WebViewActivity;->Companion:Lcom/sma/smartv3/ui/me/WebViewActivity$OXO1;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/me/WebViewActivity$OXO1;->iO()I

    move-result p2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    invoke-virtual {v0, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mArg1"

    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class p2, Lcom/sma/smartv3/ui/me/WebViewActivity;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/android/mltcode/paycertificationapi/z16;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/util/PopManager;->I1(Lcom/android/mltcode/paycertificationapi/z16;Landroid/view/View;)V

    return-void
.end method

.method public static final X0O(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/go0;)V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/ii1XXIXi;->OXO1(Landroid/app/Activity;)Landroid/view/View;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XiOIO(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public static final X1ii(ZLandroid/app/Activity;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic XIi00iiXO(ZLandroid/app/Activity;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/util/PopManager;->X1ii(ZLandroid/app/Activity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XO0O10(Ljava/lang/String;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/util/PopManager;->OII(Ljava/lang/String;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic XOO0ii0(Landroidx/appcompat/app/AppCompatActivity;Lcom/android/mltcode/paycertificationapi/lu5;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/util/PopManager;->OX(Landroidx/appcompat/app/AppCompatActivity;Lcom/android/mltcode/paycertificationapi/lu5;Landroid/view/View;)V

    return-void
.end method

.method public static final XX0(Landroidx/appcompat/app/AppCompatActivity;Lcom/android/mltcode/paycertificationapi/go0;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XiOIO(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/util/PopManager;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/util/PopManager;->I0iXXO(Landroid/app/Activity;Ljava/lang/String;Z)V

    return-void
.end method

.method public static final XiOIO()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static final iIiiO(Landroidx/appcompat/app/AppCompatActivity;)Z
    .locals 1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/i72;->Oi1I(Landroid/content/Context;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic iO(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/go0;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/util/PopManager;->X0O(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/go0;)V

    return-void
.end method


# virtual methods
.method public final I0iXXO(Landroid/app/Activity;Ljava/lang/String;Z)V
    .locals 4
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f141348

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    invoke-virtual {v0, p2}, Lcom/android/mltcode/paycertificationapi/go0;->iOO1ii1(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const p2, 0x7f14027f

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-instance v1, Lcom/android/mltcode/paycertificationapi/s12;

    invoke-direct {v1, p3, p1}, Lcom/android/mltcode/paycertificationapi/s12;-><init>(ZLandroid/app/Activity;)V

    invoke-virtual {v0, p2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance p2, Lcom/android/mltcode/paycertificationapi/t12;

    invoke-direct {p2, p1}, Lcom/android/mltcode/paycertificationapi/t12;-><init>(Landroid/app/Activity;)V

    const p3, 0x7f14034b

    invoke-virtual {v0, p3, p2}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/ii1XXIXi;->OXO1(Landroid/app/Activity;)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_0

    new-instance p3, Lcom/android/mltcode/paycertificationapi/u12;

    invoke-direct {p3, p1, v0}, Lcom/android/mltcode/paycertificationapi/u12;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/go0;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final I1XOi1(Landroidx/appcompat/app/AppCompatActivity;Landroid/view/View;Ljava/lang/String;)V
    .locals 4
    .param p1    # Landroidx/appcompat/app/AppCompatActivity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rootView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hideFlag"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p3, v1}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PopManager :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/util/PopManager;->XiOIii1(Landroidx/appcompat/app/AppCompatActivity;Landroid/view/View;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final IIX1OXO(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;)V
    .locals 5

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, p1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v2, 0x7f141348

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    invoke-virtual {v1, p2}, Lcom/android/mltcode/paycertificationapi/go0;->iOO1ii1(Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {v1, p2}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const p2, 0x7f14027f

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-instance v2, Lcom/android/mltcode/paycertificationapi/y12;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/y12;-><init>()V

    invoke-virtual {v1, p2, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance p2, Lcom/android/mltcode/paycertificationapi/z12;

    invoke-direct {p2, p1}, Lcom/android/mltcode/paycertificationapi/z12;-><init>(Landroidx/appcompat/app/AppCompatActivity;)V

    const v2, 0x7f14034b

    invoke-virtual {v1, v2, p2}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    new-instance p2, Lcom/android/mltcode/paycertificationapi/a22;

    invoke-direct {p2, p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/a22;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lcom/android/mltcode/paycertificationapi/go0;Landroid/view/View;)V

    invoke-virtual {v0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final OIX0iXi(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public final OiIIX101O(Landroid/view/View;Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroidx/appcompat/app/AppCompatActivity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroidx/appcompat/app/AppCompatActivity;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "rootView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    new-instance v4, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;

    const/4 v0, 0x0

    invoke-direct {v4, p2, p3, p1, v0}, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;Landroid/view/View;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final XiOIii1(Landroidx/appcompat/app/AppCompatActivity;Landroid/view/View;Ljava/lang/String;)V
    .locals 4
    .param p1    # Landroidx/appcompat/app/AppCompatActivity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rootView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hideFlag"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/lu5;->IiI10X:Lcom/android/mltcode/paycertificationapi/lu5$OXO1;

    invoke-virtual {v0, p3}, Lcom/android/mltcode/paycertificationapi/lu5$OXO1;->OXO1(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/lu5;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/z16;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/z16;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/lu5;->XXI()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/z16;->X11iII1O1(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/lu5;->X1ii()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/z16;->XXX11i(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/lu5;->I0iXXO()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/z16;->XXIIO1i11(Ljava/lang/Integer;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, p3, v3}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/z16;->X1IX(Ljava/lang/Boolean;)V

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/z16;->iX()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v2

    new-instance v3, Lcom/android/mltcode/paycertificationapi/v12;

    invoke-direct {v3, p3}, Lcom/android/mltcode/paycertificationapi/v12;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/z16;->OII()Landroid/widget/Button;

    move-result-object p3

    new-instance v2, Lcom/android/mltcode/paycertificationapi/w12;

    invoke-direct {v2, p1, v0}, Lcom/android/mltcode/paycertificationapi/w12;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lcom/android/mltcode/paycertificationapi/lu5;)V

    invoke-virtual {p3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/x12;

    invoke-direct {p1, v1, p2}, Lcom/android/mltcode/paycertificationapi/x12;-><init>(Lcom/android/mltcode/paycertificationapi/z16;Landroid/view/View;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
