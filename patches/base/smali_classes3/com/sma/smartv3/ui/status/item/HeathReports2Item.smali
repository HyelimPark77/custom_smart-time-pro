.class public final Lcom/sma/smartv3/ui/status/item/HeathReports2Item;
.super Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;-><init>()V

    return-void
.end method

.method public static synthetic IiI10X(Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/item/HeathReports2Item;->bindView$lambda$0(Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/item/HeathReports2Item;->bindView$lambda$0$0(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final bindView$lambda$0(Landroid/view/View;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/util/HeathReportsUtils;->OXO1:Lcom/sma/smartv3/util/HeathReportsUtils;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/app/Activity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OOii1;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/OOii1;-><init>()V

    invoke-virtual {v0}, Lcom/sma/smartv3/util/HeathReportsUtils;->IXXOO()I

    move-result v2

    invoke-virtual {v0, p0, v1, v2}, Lcom/sma/smartv3/util/HeathReportsUtils;->O0O(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final bindView$lambda$0$0(Z)Lkotlin/Unit;
    .locals 0

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final setViewBg(Landroid/view/View;F)V
    .locals 3

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/16 v1, 0x8

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p2, v1, v2

    const/4 v2, 0x1

    aput p2, v1, v2

    const/4 v2, 0x2

    aput p2, v1, v2

    const/4 v2, 0x3

    aput p2, v1, v2

    const/4 v2, 0x4

    aput p2, v1, v2

    const/4 v2, 0x5

    aput p2, v1, v2

    const/4 v2, 0x6

    aput p2, v1, v2

    const/4 v2, 0x7

    aput p2, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const v1, 0x7f06078c

    invoke-static {p2, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static synthetic setViewBg$default(Lcom/sma/smartv3/ui/status/item/HeathReports2Item;Landroid/view/View;FILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/high16 p2, 0x41700000    # 15.0f

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/status/item/HeathReports2Item;->setViewBg(Landroid/view/View;F)V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 4
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V

    const v0, 0x7f0a0c8f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v0, v3, v1, v2}, Lcom/sma/smartv3/ui/status/item/HeathReports2Item;->setViewBg$default(Lcom/sma/smartv3/ui/status/item/HeathReports2Item;Landroid/view/View;FILjava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0IOI0X;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/i0IOI0X;-><init>()V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->clickItem(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public initView()V
    .locals 0

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0eab

    return v0
.end method
