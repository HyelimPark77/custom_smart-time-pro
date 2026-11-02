.class public Lcom/sma/smartv3/ui/sport/coach/item/CompletePlanItem;
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

.method public static synthetic O00(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/item/CompletePlanItem;->initView$lambda$0(Landroid/view/View;)V

    return-void
.end method

.method private static final initView$lambda$0(Landroid/view/View;)V
    .locals 2

    const/4 p0, 0x0

    const/4 v0, 0x2

    const-string v1, "DELETE_AI_COACH_PLAN"

    invoke-static {v1, p0, v0, p0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/item/CompletePlanItem;->mButton:Landroid/widget/Button;

    return-void
.end method

.method public initView()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/CompletePlanItem;->mButton:Landroid/widget/Button;

    if-nez v0, :cond_0

    const-string v0, "mButton"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    new-instance v1, Lcom/android/mltcode/paycertificationapi/IiiOI1OO;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/IiiOI1OO;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0257

    return v0
.end method
