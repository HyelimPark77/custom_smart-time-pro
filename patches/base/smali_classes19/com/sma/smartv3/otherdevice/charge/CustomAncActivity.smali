.class public final Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;
.super Lcom/sma/smartv3/otherdevice/charge/BaseChargeActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomAncActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAncActivity.kt\ncom/sma/smartv3/otherdevice/charge/CustomAncActivity\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,273:1\n106#2:274\n78#2,22:275\n106#2:297\n78#2,22:298\n*S KotlinDebug\n*F\n+ 1 CustomAncActivity.kt\ncom/sma/smartv3/otherdevice/charge/CustomAncActivity\n*L\n182#1:274\n182#1:275,22\n183#1:297\n183#1:298,22\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCustomAncActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAncActivity.kt\ncom/sma/smartv3/otherdevice/charge/CustomAncActivity\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,273:1\n106#2:274\n78#2,22:275\n106#2:297\n78#2,22:298\n*S KotlinDebug\n*F\n+ 1 CustomAncActivity.kt\ncom/sma/smartv3/otherdevice/charge/CustomAncActivity\n*L\n182#1:274\n182#1:275,22\n183#1:297\n183#1:298,22\n*E\n"
    }
.end annotation


# instance fields
.field private final clLeft$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final clRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isLeftEdit:Z

.field private isRightEdit:Z

.field private mEarphoneAncSettings:Lcom/szabh/smable3/entity/BleEarphoneAncSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final rulerLeft$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rulerRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvLeftTips$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvLeftValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvRightTips$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvRightValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseChargeActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIOX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XIOX;-><init>(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->clLeft$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXIIX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXIIX;-><init>(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->tvLeftTips$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXOO1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXOO1i;-><init>(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->tvLeftValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIOIOXO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OIOIOXO;-><init>(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->rulerLeft$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Xii1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Xii1;-><init>(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->clRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1O1OiiOX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1O1OiiOX;-><init>(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->tvRightTips$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IiiO100;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IiiO100;-><init>(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->tvRightValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IO10XO00I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IO10XO00I;-><init>(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->rulerRight$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->EARPHONE_ANC_SET:Lcom/szabh/smable3/BleKey;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->mEarphoneAncSettings:Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->tvRightTips_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Lcom/sma/smartv3/otherdevice/jl/view/RulerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->rulerLeft_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->clRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;Landroid/view/View;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->onShowInputValue$lambda$1$0(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;Landroid/view/View;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->tvLeftTips_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->tvLeftValue_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->tvRightValue_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Lcom/sma/smartv3/otherdevice/jl/view/RulerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->rulerRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->clLeft_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMEarphoneAncSettings$p(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Lcom/szabh/smable3/entity/BleEarphoneAncSettings;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->mEarphoneAncSettings:Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    return-object p0
.end method

.method public static final synthetic access$getTvLeftValue(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getTvLeftValue()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvRightValue(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getTvRightValue()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isLeftEdit$p(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->isLeftEdit:Z

    return p0
.end method

.method public static final synthetic access$isRightEdit$p(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->isRightEdit:Z

    return p0
.end method

.method public static final synthetic access$setLeftEdit$p(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->isLeftEdit:Z

    return-void
.end method

.method public static final synthetic access$setRightEdit$p(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->isRightEdit:Z

    return-void
.end method

.method private static final clLeft_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0247

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final clRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a0248

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private final getClLeft()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->clLeft$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getClRight()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->clRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getRulerLeft()Lcom/sma/smartv3/otherdevice/jl/view/RulerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->rulerLeft$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    return-object v0
.end method

.method private final getRulerRight()Lcom/sma/smartv3/otherdevice/jl/view/RulerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->rulerRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    return-object v0
.end method

.method private final getTvLeftTips()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->tvLeftTips$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvLeftValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->tvLeftValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvRightTips()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->tvRightTips$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvRightValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->tvRightValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final onShowInputValue$lambda$1$0(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;Landroid/view/View;Ljava/lang/String;)Z
    .locals 4

    const-string v0, "text"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-static {p3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p3

    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-ltz v0, :cond_1

    iget v0, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    int-to-float v0, v0

    cmpl-float v0, p3, v0

    if-lez v0, :cond_2

    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget p0, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    const v0, 0x7f140d23

    invoke-virtual {p1, v0, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p0, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    const/16 p0, 0xc8

    int-to-float v0, p0

    div-float/2addr p3, v0

    float-to-double v0, p3

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    int-to-double v2, p0

    mul-double/2addr v0, v2

    double-to-float p0, v0

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    const p3, 0x7f0a0657

    const/4 v0, 0x1

    if-ne p2, p3, :cond_3

    iput-boolean v0, p1, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->isRightEdit:Z

    invoke-direct {p1}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getRulerRight()Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    move-result-object p1

    int-to-float p0, p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X0O(F)V

    goto :goto_0

    :cond_3
    iput-boolean v0, p1, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->isLeftEdit:Z

    invoke-direct {p1}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getRulerLeft()Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    move-result-object p1

    int-to-float p0, p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X0O(F)V

    :goto_0
    return v0
.end method

.method private static final rulerLeft_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Lcom/sma/smartv3/otherdevice/jl/view/RulerView;
    .locals 1

    const v0, 0x7f0a09bf

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    return-object p0
.end method

.method private static final rulerRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Lcom/sma/smartv3/otherdevice/jl/view/RulerView;
    .locals 1

    const v0, 0x7f0a09c0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    return-object p0
.end method

.method private final saveConfigure()V
    .locals 12

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->mEarphoneAncSettings:Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->getMAncModeList()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->mEarphoneAncSettings:Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->getMMode()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleAncMode;

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getTvLeftValue()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    :goto_0
    const/16 v7, 0x20

    if-gt v5, v2, :cond_5

    if-nez v6, :cond_0

    move v8, v5

    goto :goto_1

    :cond_0
    move v8, v2

    :goto_1
    invoke-interface {v1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->iIiiO(II)I

    move-result v8

    if-gtz v8, :cond_1

    move v8, v3

    goto :goto_2

    :cond_1
    move v8, v4

    :goto_2
    if-nez v6, :cond_3

    if-nez v8, :cond_2

    move v6, v3

    goto :goto_0

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    if-nez v8, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_5
    :goto_3
    add-int/2addr v2, v3

    invoke-interface {v1, v5, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getTvRightValue()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    sub-int/2addr v5, v3

    move v6, v4

    move v8, v6

    :goto_4
    if-gt v6, v5, :cond_b

    if-nez v8, :cond_6

    move v9, v6

    goto :goto_5

    :cond_6
    move v9, v5

    :goto_5
    invoke-interface {v2, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    invoke-static {v9, v7}, Lkotlin/jvm/internal/Intrinsics;->iIiiO(II)I

    move-result v9

    if-gtz v9, :cond_7

    move v9, v3

    goto :goto_6

    :cond_7
    move v9, v4

    :goto_6
    if-nez v8, :cond_9

    if-nez v9, :cond_8

    move v8, v3

    goto :goto_4

    :cond_8
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_9
    if-nez v9, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v5, v5, -0x1

    goto :goto_4

    :cond_b
    :goto_7
    add-int/2addr v5, v3

    invoke-interface {v2, v6, v5}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_c

    move v1, v4

    goto :goto_8

    :cond_c
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    :goto_8
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_d

    move v2, v4

    goto :goto_9

    :cond_d
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    :goto_9
    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMLeftCurVal()I

    move-result v5

    if-eq v1, v5, :cond_e

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleAncMode;->setMLeftCurVal(I)V

    move v4, v3

    :cond_e
    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMRightCurVal()I

    move-result v1

    if-eq v2, v1, :cond_f

    invoke-virtual {v0, v2}, Lcom/szabh/smable3/entity/BleAncMode;->setMRightCurVal(I)V

    goto :goto_a

    :cond_f
    move v3, v4

    :goto_a
    if-eqz v3, :cond_10

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v5, Lcom/szabh/smable3/BleKey;->EARPHONE_ANC_SET:Lcom/szabh/smable3/BleKey;

    sget-object v6, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v7, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->mEarphoneAncSettings:Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    const/16 v10, 0x18

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    :cond_10
    return-void
.end method

.method private static final tvLeftTips_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cc2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvLeftValue_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cc3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvRightTips_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cc4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvRightValue_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cc5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final updateVoiceMode()V
    .locals 12

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->mEarphoneAncSettings:Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->getMAncModeList()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->mEarphoneAncSettings:Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->getMMode()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleAncMode;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->mEarphoneAncSettings:Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateVoiceMode -> mode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->mEarphoneAncSettings:Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->getMMode()I

    move-result v1

    if-eqz v1, :cond_6

    const/4 v2, 0x1

    const-string v3, "getString(...)"

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const v0, 0x7f141467

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    const v1, 0x7f1413bb

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f140e08

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f1411a9

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const v1, 0x7f1403ed

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f140e05

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f1411a6

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getClLeft()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMLeftMax()I

    move-result v4

    const/16 v5, 0x8

    const/4 v6, 0x0

    if-lez v4, :cond_2

    move v4, v6

    goto :goto_1

    :cond_2
    move v4, v5

    :goto_1
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMLeftMax()I

    move-result v3

    const/16 v4, 0x190

    const/16 v7, 0xc8

    if-lez v3, :cond_3

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getTvLeftTips()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getTvLeftValue()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMLeftCurVal()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getRulerLeft()Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->setScaleLimit(I)V

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMLeftMax()I

    move-result v1

    int-to-float v1, v1

    int-to-float v3, v7

    div-float/2addr v1, v3

    float-to-double v8, v1

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    int-to-double v10, v7

    mul-double/2addr v8, v10

    double-to-float v1, v8

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMLeftCurVal()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v8, v3

    float-to-double v8, v8

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    mul-double/2addr v8, v10

    double-to-float v3, v8

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getRulerLeft()Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    move-result-object v8

    invoke-virtual {v8, v6, v1, v3}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XiOIii1(IFF)V

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getClRight()Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMRightMax()I

    move-result v3

    if-lez v3, :cond_4

    move v5, v6

    :cond_4
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMRightMax()I

    move-result v1

    if-lez v1, :cond_5

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getTvRightTips()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getTvRightValue()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMRightCurVal()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getRulerRight()Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->setScaleLimit(I)V

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMRightMax()I

    move-result v1

    int-to-float v1, v1

    int-to-float v2, v7

    div-float/2addr v1, v2

    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    int-to-double v7, v7

    mul-double/2addr v3, v7

    double-to-float v1, v3

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMRightCurVal()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v2

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    mul-double/2addr v2, v7

    double-to-float v0, v2

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getRulerRight()Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    move-result-object v2

    invoke-virtual {v2, v6, v1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XiOIii1(IFF)V

    :cond_5
    return-void

    :cond_6
    const v0, 0x7f140d30

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

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
    .locals 2

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f14101d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const v0, 0x7f0a0020

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f14101e

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getRulerLeft()Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$OXO1;-><init>(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->setOnChooseResulterListener(Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getRulerRight()Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->setOnChooseResulterListener(Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->updateVoiceMode()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0055

    return v0
.end method

.method public onDestroy()V
    .locals 0

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->saveConfigure()V

    return-void
.end method

.method public final onShowInputValue(Landroid/view/View;)V
    .locals 8
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->mEarphoneAncSettings:Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->getMAncModeList()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->mEarphoneAncSettings:Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->getMMode()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleAncMode;

    new-instance v1, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    const v3, 0x7f0a0657

    if-ne v2, v3, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getTvRightValue()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMRightMax()I

    move-result v0

    iput v0, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const v0, 0x7f1411a9

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->getTvLeftValue()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMLeftMax()I

    move-result v0

    iput v0, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const v0, 0x7f140e08

    :goto_0
    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    if-nez v3, :cond_1

    new-instance v3, Lcom/android/mltcode/paycertificationapi/iii1ii;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v4, v5, v7, v6}, Lcom/android/mltcode/paycertificationapi/iii1ii;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X01IiOiIi()Landroid/widget/EditText;

    move-result-object v4

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setInputType(I)V

    iput-object v3, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    :cond_1
    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    if-eqz v3, :cond_2

    invoke-virtual {v3, v0}, Lcom/android/mltcode/paycertificationapi/iii1ii;->XXX11i(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIX0IiX;

    invoke-direct {v0, v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/XIX0IiX;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;Landroid/view/View;)V

    invoke-virtual {v3, v0}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X11iII1O1(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X01IiOiIi()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X01IiOiIi()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f06024d

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
