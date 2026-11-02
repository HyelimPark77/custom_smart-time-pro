.class public Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private mCardView:Landroid/widget/LinearLayout;

.field public mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;->bindView$lambda$1(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;->bindView$lambda$0(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;Landroid/view/View;)V

    return-void
.end method

.method private static final bindView$lambda$0(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;->getMContext()Landroid/content/Context;

    move-result-object p0

    const-class v1, Lcom/sma/smartv3/ui/sport/course/CourseSearchActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final bindView$lambda$1(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;->getMContext()Landroid/content/Context;

    move-result-object p0

    const-class v1, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 5
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a09f8

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;->mCardView:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    const-string v3, "mCardView"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v4, "getContext(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;->setMContext(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;->mCardView:Landroid/widget/LinearLayout;

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v2, v1}, Lcom/sma/smartv3/util/UtilsKt;->IX1XiI(Landroid/view/View;F)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X00Xi1i01;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/X00Xi1i01;-><init>(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;)V

    invoke-virtual {p1, v0, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiI00iO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiI00iO;-><init>(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;)V

    const v1, 0x7f0a03d8

    invoke-virtual {p1, v1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initView()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;->mCardView:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    const-string v0, "mCardView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;->getMContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0607b0

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e60

    return v0
.end method

.method public final onThemeChange(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "THEME_CHANGE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onThemeChange"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;->initView()V

    return-void
.end method

.method public final setMContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;->mContext:Landroid/content/Context;

    return-void
.end method
