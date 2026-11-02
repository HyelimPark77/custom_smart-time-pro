.class public Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private cumulativeCalories:Landroid/widget/TextView;

.field private cumulativeMETS:Landroid/widget/TextView;

.field private cumulativeTime:Landroid/widget/TextView;

.field private currentCompleted:Landroid/widget/TextView;

.field private currentDay:Landroid/widget/TextView;

.field private currentProgress:Landroid/widget/ProgressBar;

.field private mPopupWindow:Landroid/widget/PopupWindow;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private planArrowIv:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->initView$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->initView$lambda$0$1(Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XOO0ii0(Landroid/view/View;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->initView$lambda$0$0$0(Landroid/view/View;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final differenceTime(J)I
    .locals 7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "planDetail differenceTime time="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, "  , currentTimeMillis = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long p1, p1, v2

    const/4 p2, 0x1

    if-lez p1, :cond_0

    return p2

    :cond_0
    const p1, 0x5265c00

    int-to-long v2, p1

    div-long/2addr v0, v2

    long-to-int p1, v0

    add-int/2addr p1, p2

    return p1
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;Landroid/view/View;)V
    .locals 8

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->planArrowIv:Landroid/widget/ImageView;

    const-string v0, "planArrowIv"

    const/4 v1, 0x0

    if-nez p1, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v2, "layout_inflater"

    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "null cannot be cast to non-null type android.view.LayoutInflater"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/LayoutInflater;

    const v2, 0x7f0d104d

    invoke-virtual {p1, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const-string v2, "inflate(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->mPopupWindow:Landroid/widget/PopupWindow;

    if-nez v2, :cond_1

    new-instance v2, Landroid/widget/PopupWindow;

    const/4 v3, -0x2

    invoke-direct {v2, p1, v3, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v2, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->mPopupWindow:Landroid/widget/PopupWindow;

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_2
    :goto_0
    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->mPopupWindow:Landroid/widget/PopupWindow;

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {v2, v3}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    :cond_3
    const/4 v2, 0x2

    new-array v2, v2, [I

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->planArrowIv:Landroid/widget/ImageView;

    if-nez v4, :cond_4

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v1

    :cond_4
    invoke-virtual {v4, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v4, 0x0

    aget v5, v2, v4

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->planArrowIv:Landroid/widget/ImageView;

    if-nez v6, :cond_5

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v1

    :cond_5
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v6

    sub-int v6, v5, v6

    add-int/2addr v5, v6

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->planArrowIv:Landroid/widget/ImageView;

    if-nez v6, :cond_6

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v1

    :cond_6
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const/high16 v7, 0x41a00000    # 20.0f

    invoke-static {v6, v7}, Lcom/android/mltcode/paycertificationapi/OXI1i1;->XIi00iiXO(Landroid/content/Context;F)I

    move-result v6

    add-int/2addr v5, v6

    aget v2, v2, v3

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->planArrowIv:Landroid/widget/ImageView;

    if-nez v3, :cond_7

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_7
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz v3, :cond_9

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->planArrowIv:Landroid/widget/ImageView;

    if-nez v6, :cond_8

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    move-object v1, v6

    :goto_1
    add-int/lit8 v5, v5, -0xa

    invoke-virtual {v3, v1, v4, v5, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    :cond_9
    const v0, 0x7f0a095d

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dx1;

    invoke-direct {v1, p0, v0}, Lcom/android/mltcode/paycertificationapi/dx1;-><init>(Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0961

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ex1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ex1;-><init>(Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;Landroid/view/View;Landroid/view/View;)V
    .locals 2

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/i72;->iOIi00Ii()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lcom/android/mltcode/paycertificationapi/fx1;

    invoke-direct {p2, p1}, Lcom/android/mltcode/paycertificationapi/fx1;-><init>(Landroid/view/View;)V

    const/4 p1, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v1, p2, p1, v0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const p1, 0x7f140032

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_0
    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    return-void
.end method

.method private static final initView$lambda$0$0$0(Landroid/view/View;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "type"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$0$1(Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;Landroid/view/View;)V
    .locals 2

    const/4 p1, 0x0

    const/4 v0, 0x2

    const-string v1, "DELETE_AI_COACH_PLAN"

    invoke-static {v1, p1, v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private final setCompletedTime(II)V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->currentDay:Landroid/widget/TextView;

    const/4 v1, 0x0

    const-string v2, "currentDay"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->currentDay:Landroid/widget/TextView;

    if-nez v3, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->IXI(Landroid/content/Context;)Z

    move-result v1

    const-string v2, " "

    const-string v3, "/"

    const v4, 0x7f1403ca

    if-eqz v1, :cond_2

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic setCompletedTime$default(Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;IIILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_2

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/16 p2, 0x1c

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->setCompletedTime(II)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: setCompletedTime"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a092d

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->currentDay:Landroid/widget/TextView;

    const v0, 0x7f0a092c

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->currentCompleted:Landroid/widget/TextView;

    const v0, 0x7f0a092e

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->currentProgress:Landroid/widget/ProgressBar;

    const v0, 0x7f0a0929

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->cumulativeTime:Landroid/widget/TextView;

    const v0, 0x7f0a092a

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->cumulativeMETS:Landroid/widget/TextView;

    const v0, 0x7f0a0928

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->cumulativeCalories:Landroid/widget/TextView;

    const v0, 0x7f0a092b

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->planArrowIv:Landroid/widget/ImageView;

    return-void
.end method

.method public final getMPopupWindow()Landroid/widget/PopupWindow;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->mPopupWindow:Landroid/widget/PopupWindow;

    return-object v0
.end method

.method public initView()V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p0, v0, v0, v1, v2}, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->setCompletedTime$default(Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;IIILjava/lang/Object;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->currentCompleted:Landroid/widget/TextView;

    if-nez v1, :cond_0

    const-string v1, "currentCompleted"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    sget-object v3, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMProgress()I

    move-result v4

    const v5, 0x7f1402fc

    invoke-static {v5}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "% "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->currentProgress:Landroid/widget/ProgressBar;

    const-string v4, "currentProgress"

    if-nez v1, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    const/16 v5, 0x64

    invoke-virtual {v1, v5}, Landroid/widget/ProgressBar;->setMax(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->currentProgress:Landroid/widget/ProgressBar;

    if-nez v1, :cond_2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_2
    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMProgress()I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->cumulativeTime:Landroid/widget/TextView;

    if-nez v1, :cond_3

    const-string v1, "cumulativeTime"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_3
    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMAllExerciseTime()I

    move-result v4

    const v5, 0x7f140f4f

    invoke-static {v5}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->cumulativeMETS:Landroid/widget/TextView;

    if-nez v1, :cond_4

    const-string v1, "cumulativeMETS"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_4
    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMAll_METS()F

    move-result v5

    float-to-int v5, v5

    const v6, 0x7f140033

    invoke-static {v6}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->cumulativeCalories:Landroid/widget/TextView;

    if-nez v1, :cond_5

    const-string v1, "cumulativeCalories"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_5
    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMAllCalorie()I

    move-result v5

    const v6, 0x7f140d64

    invoke-static {v6}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->I0iXXO()Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getStartTime()J

    move-result-wide v4

    invoke-direct {p0, v4, v5}, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->differenceTime(J)I

    move-result v7

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->I0iXXO()Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMProgress()I

    move-result v1

    move v9, v1

    goto :goto_0

    :cond_6
    move v9, v0

    :goto_0
    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->I0iXXO()Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMProgress()I

    move-result v1

    move v10, v1

    goto :goto_1

    :cond_7
    move v10, v0

    :goto_1
    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->I0iXXO()Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMAllExerciseTime()I

    move-result v1

    move v11, v1

    goto :goto_2

    :cond_8
    move v11, v0

    :goto_2
    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->I0iXXO()Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMAll_METS()F

    move-result v1

    float-to-int v1, v1

    move v12, v1

    goto :goto_3

    :cond_9
    move v12, v0

    :goto_3
    invoke-virtual {v3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->I0iXXO()Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->getMAllCalorie()I

    move-result v0

    :cond_a
    move v13, v0

    const/16 v8, 0x1c

    move-object v6, p0

    invoke-virtual/range {v6 .. v13}, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->setPlanDetail(IIIIIII)V

    goto :goto_4

    :cond_b
    move-object v6, p0

    :goto_4
    iget-object v0, v6, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->planArrowIv:Landroid/widget/ImageView;

    if-nez v0, :cond_c

    const-string v0, "planArrowIv"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_5

    :cond_c
    move-object v2, v0

    :goto_5
    new-instance v0, Lcom/android/mltcode/paycertificationapi/cx1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/cx1;-><init>(Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d025b

    return v0
.end method

.method public final setMPopupWindow(Landroid/widget/PopupWindow;)V
    .locals 0
    .param p1    # Landroid/widget/PopupWindow;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->mPopupWindow:Landroid/widget/PopupWindow;

    return-void
.end method

.method public final setPlanDetail(IIIIIII)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->setCompletedTime(II)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->currentCompleted:Landroid/widget/TextView;

    const/4 p2, 0x0

    if-nez p1, :cond_0

    const-string p1, "currentCompleted"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, p2

    :cond_0
    const v0, 0x7f1402fc

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "% "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->currentProgress:Landroid/widget/ProgressBar;

    const-string p3, "currentProgress"

    if-nez p1, :cond_1

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, p2

    :cond_1
    const/16 v0, 0x64

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setMax(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->currentProgress:Landroid/widget/ProgressBar;

    if-nez p1, :cond_2

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, p2

    :cond_2
    invoke-virtual {p1, p4}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->cumulativeTime:Landroid/widget/TextView;

    if-nez p1, :cond_3

    const-string p1, "cumulativeTime"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, p2

    :cond_3
    const p3, 0x7f140f4f

    invoke-static {p3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p3

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p5, " "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->cumulativeMETS:Landroid/widget/TextView;

    if-nez p1, :cond_4

    const-string p1, "cumulativeMETS"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, p2

    :cond_4
    const p3, 0x7f140033

    invoke-static {p3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p3

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;->cumulativeCalories:Landroid/widget/TextView;

    if-nez p1, :cond_5

    const-string p1, "cumulativeCalories"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object p2, p1

    :goto_0
    const p1, 0x7f140d64

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
