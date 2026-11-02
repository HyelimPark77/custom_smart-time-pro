.class public Lcom/sma/smartv3/ui/sport/coach/item/LackPlanItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private mButton:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/sport/coach/item/LackPlanItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/item/LackPlanItem;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/coach/item/LackPlanItem;Landroid/view/View;)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/coach/item/LackPlanItem;Landroid/view/View;)V
    .locals 3

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->iOIi00Ii()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/item/LackPlanItem;->mButton:Landroid/widget/Button;

    const/4 v0, 0x0

    const-string v1, "mButton"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v2, Landroid/content/Intent;

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/coach/item/LackPlanItem;->mButton:Landroid/widget/Button;

    if-nez p0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, p0

    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-class v0, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_2
    const p0, 0x7f140032

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
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

    const v0, 0x7f0a025a

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/item/LackPlanItem;->mButton:Landroid/widget/Button;

    return-void
.end method

.method public initView()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/LackPlanItem;->mButton:Landroid/widget/Button;

    if-nez v0, :cond_0

    const-string v0, "mButton"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    new-instance v1, Lcom/android/mltcode/paycertificationapi/yi;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/yi;-><init>(Lcom/sma/smartv3/ui/sport/coach/item/LackPlanItem;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d025a

    return v0
.end method
