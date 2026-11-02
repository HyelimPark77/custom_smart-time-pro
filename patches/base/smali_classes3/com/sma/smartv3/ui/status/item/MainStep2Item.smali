.class public final Lcom/sma/smartv3/ui/status/item/MainStep2Item;
.super Lcom/sma/smartv3/ui/status/item/MainStepItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainStep2Item.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainStep2Item.kt\ncom/sma/smartv3/ui/status/item/MainStep2Item\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n87#2,7:260\n94#2,3:268\n70#2,7:271\n97#2:278\n1#3:267\n*S KotlinDebug\n*F\n+ 1 MainStep2Item.kt\ncom/sma/smartv3/ui/status/item/MainStep2Item\n*L\n180#1:260,7\n180#1:268,3\n180#1:271,7\n180#1:278\n180#1:267\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMainStep2Item.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainStep2Item.kt\ncom/sma/smartv3/ui/status/item/MainStep2Item\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n87#2,7:260\n94#2,3:268\n70#2,7:271\n97#2:278\n1#3:267\n*S KotlinDebug\n*F\n+ 1 MainStep2Item.kt\ncom/sma/smartv3/ui/status/item/MainStep2Item\n*L\n180#1:260,7\n180#1:268,3\n180#1:271,7\n180#1:278\n180#1:267\n*E\n"
    }
.end annotation


# instance fields
.field private goalProgressBar:Lcom/sma/smartv3/view/Goal2ProgressBar;

.field private imgSwitch:Landroid/widget/ImageView;

.field private isTransverseLayout:Z

.field private ivRight:Landroid/widget/ImageView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mMarqueeList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private rlTipContent:Landroid/view/View;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private transverseGoal:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private tvDistance:Landroid/widget/TextView;

.field private tvMarquee:Lcom/sma/smartv3/view/MarqueeTextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private tvStep:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->mMarqueeList:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->bindView$lambda$4(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->bindView$lambda$3(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->bindView$lambda$1(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->setMarqueeView$lambda$1$0(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/status/item/MainStep2Item;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->setMarqueeView$lambda$0$0(Lcom/sma/smartv3/ui/status/item/MainStep2Item;I)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->bindView$lambda$2(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->bindView$lambda$0(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V

    return-void
.end method

.method private static final bindView$lambda$0(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/w85;->OXO1:Lcom/android/mltcode/paycertificationapi/w85;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/w85;->OXO1()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p0

    const-class v1, Lcom/sma/smartv3/ui/status/StepActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    invoke-static {p1, v0, p0}, Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method private static final bindView$lambda$1(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/w85;->OXO1:Lcom/android/mltcode/paycertificationapi/w85;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/w85;->OXO1()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p0

    const-class v1, Lcom/sma/smartv3/ui/status/DistanceActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    invoke-static {p1, v0, p0}, Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method private static final bindView$lambda$2(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/w85;->OXO1:Lcom/android/mltcode/paycertificationapi/w85;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/w85;->OXO1()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p0

    const-class v1, Lcom/sma/smartv3/ui/status/CaloriesActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    invoke-static {p1, v0, p0}, Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method private static final bindView$lambda$3(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p0

    const-class v1, Lcom/sma/smartv3/ui/me/GoalSettingActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    invoke-static {p1, v0, p0}, Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void
.end method

.method private static final bindView$lambda$4(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->isTransverseLayout:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "MAIN_STEP_TRANSVERSE"

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->isTransverseLayout:Z

    xor-int/lit8 p1, p1, 0x1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->getTabLayoutID(Z)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemLayoutId(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->initView()V

    return-void
.end method

.method private final getTabLayoutID(Z)I
    .locals 1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->isTransverseLayout:Z

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->OX110i()Z

    move-result p1

    const v0, 0x7f0d10a4

    if-eqz p1, :cond_0

    return v0

    :cond_0
    iget-boolean p1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->isTransverseLayout:Z

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const p1, 0x7f0d10a3

    return p1
.end method

.method public static synthetic getTabLayoutID$default(Lcom/sma/smartv3/ui/status/item/MainStep2Item;ZILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string p2, "MAIN_STEP_TRANSVERSE"

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->getTabLayoutID(Z)I

    move-result p0

    return p0
.end method

.method private final setMarqueeView()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->tvMarquee:Lcom/sma/smartv3/view/MarqueeTextView;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->mMarqueeList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->mMarqueeList:Ljava/util/ArrayList;

    const v2, 0x7f141479

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->mMarqueeList:Ljava/util/ArrayList;

    const v2, 0x7f14117d

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->mMarqueeList:Ljava/util/ArrayList;

    const v2, 0x7f1414a4

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/android/mltcode/paycertificationapi/q30;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/q30;-><init>(Lcom/sma/smartv3/ui/status/item/MainStep2Item;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/MarqueeTextView;->setMarqueeListener(Lcom/sma/smartv3/view/MarqueeTextView$iO;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->mMarqueeList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/MarqueeTextView;->setTextList(Ljava/util/List;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->rlTipContent:Landroid/view/View;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/android/mltcode/paycertificationapi/r30;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/r30;-><init>(Lcom/sma/smartv3/ui/status/item/MainStep2Item;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void
.end method

.method private static final setMarqueeView$lambda$0$0(Lcom/sma/smartv3/ui/status/item/MainStep2Item;I)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->ivRight:Landroid/widget/ImageView;

    if-eqz p0, :cond_2

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    :cond_0
    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->ivRight:Landroid/widget/ImageView;

    if-eqz p0, :cond_2

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    :cond_1
    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->ivRight:Landroid/widget/ImageView;

    if-eqz p0, :cond_2

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method private static final setMarqueeView$lambda$1$0(Lcom/sma/smartv3/ui/status/item/MainStep2Item;Landroid/view/View;)V
    .locals 4

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->tvMarquee:Lcom/sma/smartv3/view/MarqueeTextView;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget p1, p1, Lcom/sma/smartv3/view/MarqueeTextView;->XXX11i:I

    const-string v0, "null cannot be cast to non-null type android.app.Activity"

    if-eqz p1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/app/Activity;

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2}, Lcom/android/mltcode/paycertificationapi/i72;->X1ii(Lcom/android/mltcode/paycertificationapi/i72;Landroid/app/Activity;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "https://api.iot-solution.net/web/guideSMARTTIMEPRO/dist/?pid=58&app="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v3, "mArg0"

    invoke-virtual {v0, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mArg1"

    invoke-virtual {v0, p1, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/WebViewActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/i72;->OIXOXXi(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 6
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V

    const v0, 0x7f0a0b36

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/Goal2ProgressBar;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->goalProgressBar:Lcom/sma/smartv3/view/Goal2ProgressBar;

    const v0, 0x7f0a0c14

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->tvStep:Landroid/widget/TextView;

    const v0, 0x7f0a0c05

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->tvDistance:Landroid/widget/TextView;

    const v0, 0x7f0a0b63

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->imgSwitch:Landroid/widget/ImageView;

    const v1, 0x7f0a0cb4

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Lcom/sma/smartv3/view/MarqueeTextView;

    iput-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->tvMarquee:Lcom/sma/smartv3/view/MarqueeTextView;

    const v1, 0x7f0a0667

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->ivRight:Landroid/widget/ImageView;

    const v1, 0x7f0a09a9

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->rlTipContent:Landroid/view/View;

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->isTransverseLayout:Z

    if-nez v1, :cond_0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->OX110i()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const v1, 0x7f0a0bf2

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->transverseGoal:Landroid/widget/TextView;

    :cond_1
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->OXii10I()Z

    move-result v2

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->tvMarquee:Lcom/sma/smartv3/view/MarqueeTextView;

    if-eqz v2, :cond_2

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->setMarqueeView()V

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->tvMarquee:Lcom/sma/smartv3/view/MarqueeTextView;

    if-eqz v2, :cond_4

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    :goto_0
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->OX110i()Z

    move-result v1

    const/4 v2, 0x0

    const-string v5, "imgSwitch"

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->imgSwitch:Landroid/widget/ImageView;

    if-nez v1, :cond_5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    move-object v2, v1

    :goto_1
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->imgSwitch:Landroid/widget/ImageView;

    if-nez v1, :cond_7

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    move-object v2, v1

    :goto_2
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_3
    const v1, 0x7f0a06c6

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_8

    new-instance v2, Lcom/android/mltcode/paycertificationapi/l30;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/l30;-><init>(Lcom/sma/smartv3/ui/status/item/MainStep2Item;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_8
    const v1, 0x7f0a06ba

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_9

    new-instance v2, Lcom/android/mltcode/paycertificationapi/m30;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/m30;-><init>(Lcom/sma/smartv3/ui/status/item/MainStep2Item;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_9
    const v1, 0x7f0a06b7

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_a

    new-instance v2, Lcom/android/mltcode/paycertificationapi/n30;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/n30;-><init>(Lcom/sma/smartv3/ui/status/item/MainStep2Item;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_a
    sget-object v1, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1:Lcom/android/mltcode/paycertificationapi/iiOI111I;

    sget-object v2, Lcom/sma/smartv3/view/text/MyTypeface;->PF_MEDIUM:Lcom/sma/smartv3/view/text/MyTypeface;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1(Lcom/sma/smartv3/view/text/MyTypeface;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getTvTemperature()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const v1, 0x7f0a06ef

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_b

    new-instance v2, Lcom/android/mltcode/paycertificationapi/o30;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/o30;-><init>(Lcom/sma/smartv3/ui/status/item/MainStep2Item;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_b
    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_c

    new-instance v0, Lcom/android/mltcode/paycertificationapi/p30;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/p30;-><init>(Lcom/sma/smartv3/ui/status/item/MainStep2Item;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_c
    return-void
.end method

.method public layoutId()I
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->getTabLayoutID$default(Lcom/sma/smartv3/ui/status/item/MainStep2Item;ZILjava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final onGoalChange(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "goal_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->initView()V

    return-void
.end method

.method public final onThemeChanges(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "THEME_CHANGE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "SELECT_THEME"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onThemeChange now Theme"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->tvMarquee:Lcom/sma/smartv3/view/MarqueeTextView;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/view/MarqueeTextView;->getCurrentView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f06074b

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p1}, Lcom/sma/smartv3/view/MarqueeTextView;->getNextView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method

.method public updateActivity()V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->updateActivity()V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v1, Lcom/szabh/smable3/BleKey;->STEP_GOAL:Lcom/szabh/smable3/BleKey;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/szabh/smable3/component/BaseBleCache;->getInt$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)I

    move-result v6

    sget-object v1, Lcom/szabh/smable3/BleKey;->CALORIES_GOAL:Lcom/szabh/smable3/BleKey;

    invoke-static/range {v0 .. v5}, Lcom/szabh/smable3/component/BaseBleCache;->getInt$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)I

    move-result v1

    sget-object v7, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v7}, Lcom/android/mltcode/paycertificationapi/q62;->i0XI0()Z

    move-result v2

    if-eqz v2, :cond_1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move v8, v1

    goto :goto_2

    :cond_1
    :goto_1
    sget-object v1, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getGender()I

    move-result v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getWeight()F

    move-result v3

    invoke-virtual {v1, v2, v3, v6}, Lcom/android/mltcode/paycertificationapi/o65;->I0IIOi(IFI)I

    move-result v1

    goto :goto_0

    :goto_2
    sget-object v1, Lcom/szabh/smable3/BleKey;->DISTANCE_GOAL:Lcom/szabh/smable3/BleKey;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/szabh/smable3/component/BaseBleCache;->getInt$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)I

    move-result v0

    invoke-virtual {v7}, Lcom/android/mltcode/paycertificationapi/q62;->i0XI0()Z

    move-result v1

    if-eqz v1, :cond_2

    if-nez v0, :cond_3

    :cond_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v1

    invoke-virtual {v0, v1, v6}, Lcom/android/mltcode/paycertificationapi/o65;->OIi0(FI)I

    move-result v0

    :cond_3
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pb -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->goalProgressBar:Lcom/sma/smartv3/view/Goal2ProgressBar;

    const-string v2, "goalProgressBar"

    const/4 v3, 0x0

    if-nez v1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_4
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getActivity()Lcom/sma/smartv3/db/entity/Activity;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v4

    div-int/lit16 v4, v4, 0x2710

    invoke-virtual {v1, v4, v8}, Lcom/sma/smartv3/view/Goal2ProgressBar;->O00(II)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->goalProgressBar:Lcom/sma/smartv3/view/Goal2ProgressBar;

    if-nez v1, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_5
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getActivity()Lcom/sma/smartv3/db/entity/Activity;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v4

    invoke-virtual {v1, v4, v6}, Lcom/sma/smartv3/view/Goal2ProgressBar;->IiI10X(II)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->goalProgressBar:Lcom/sma/smartv3/view/Goal2ProgressBar;

    if-nez v1, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_6
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getActivity()Lcom/sma/smartv3/db/entity/Activity;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v2

    div-int/lit16 v2, v2, 0x2710

    invoke-virtual {v1, v2, v0}, Lcom/sma/smartv3/view/Goal2ProgressBar;->XO0O10(II)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->tvStep:Landroid/widget/TextView;

    if-nez v0, :cond_7

    const-string v0, "tvStep"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_7
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getActivity()Lcom/sma/smartv3/db/entity/Activity;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->tvDistance:Landroid/widget/TextView;

    if-nez v0, :cond_8

    const-string v0, "tvDistance"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    move-object v3, v0

    :goto_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getActivity()Lcom/sma/smartv3/db/entity/Activity;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v0

    div-int/lit16 v0, v0, 0x2710

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->I1XOi1(IIZ)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->isTransverseLayout:Z

    if-nez v0, :cond_9

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->OX110i()Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_9
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStep2Item;->transverseGoal:Landroid/widget/TextView;

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getActivity()Lcom/sma/smartv3/db/entity/Activity;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_a
    return-void
.end method

.method public updateWeather()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->updateWeather()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getTvWeatherTime()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getTvTemperature()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getTvTemperature()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getTvTemperature()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
