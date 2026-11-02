.class public Lcom/sma/smartv3/ui/device/item/InfoItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;
    }
.end annotation


# instance fields
.field private btnMultiDevice:Landroid/view/View;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final handler:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final initEvent:Z

.field private ivConnection:Landroid/widget/ImageView;

.field private ivDevice:Landroid/widget/ImageView;

.field private ivPower:Landroid/widget/ImageView;

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/InfoItem$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private mCurPower:I

.field private mOnClickListener:Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final switchStatusRunnable$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public tvName:Landroid/widget/TextView;

.field private tvPower:Landroid/widget/TextView;

.field private viewPaired:Landroid/view/View;

.field private viewUnpaired:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->initEvent:Z

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->handler:Landroid/os/Handler;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/d5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/d5;-><init>(Lcom/sma/smartv3/ui/device/item/InfoItem;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->switchStatusRunnable$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/item/InfoItem$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/item/InfoItem$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/item/InfoItem;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/InfoItem$XIi00iiXO;

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/device/item/InfoItem;)Ljava/lang/Runnable;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/item/InfoItem;->switchStatusRunnable_delegate$lambda$0(Lcom/sma/smartv3/ui/device/item/InfoItem;)Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/device/item/InfoItem;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/item/InfoItem;->switchStatusRunnable_delegate$lambda$0$0(Lcom/sma/smartv3/ui/device/item/InfoItem;)V

    return-void
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/device/item/InfoItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/item/InfoItem;->bindView$lambda$0(Lcom/sma/smartv3/ui/device/item/InfoItem;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getHandler$p(Lcom/sma/smartv3/ui/device/item/InfoItem;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getIvConnection$p(Lcom/sma/smartv3/ui/device/item/InfoItem;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->ivConnection:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getIvPower$p(Lcom/sma/smartv3/ui/device/item/InfoItem;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->ivPower:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getMContext$p(Lcom/sma/smartv3/ui/device/item/InfoItem;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$getSwitchStatusRunnable(Lcom/sma/smartv3/ui/device/item/InfoItem;)Ljava/lang/Runnable;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/InfoItem;->getSwitchStatusRunnable()Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvPower$p(Lcom/sma/smartv3/ui/device/item/InfoItem;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->tvPower:Landroid/widget/TextView;

    return-object p0
.end method

.method public static final synthetic access$setMCurPower$p(Lcom/sma/smartv3/ui/device/item/InfoItem;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->mCurPower:I

    return-void
.end method

.method private static final bindView$lambda$0(Lcom/sma/smartv3/ui/device/item/InfoItem;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->mOnClickListener:Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;

    if-eqz p0, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private final getSwitchStatusRunnable()Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->switchStatusRunnable$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    return-object v0
.end method

.method private static final switchStatusRunnable_delegate$lambda$0(Lcom/sma/smartv3/ui/device/item/InfoItem;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/e5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/e5;-><init>(Lcom/sma/smartv3/ui/device/item/InfoItem;)V

    return-object v0
.end method

.method private static final switchStatusRunnable_delegate$lambda$0$0(Lcom/sma/smartv3/ui/device/item/InfoItem;)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->ivConnection:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "ivConnection"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->ivPower:Landroid/widget/ImageView;

    if-nez v0, :cond_1

    const-string v0, "ivPower"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IIiiIiXiI()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->tvPower:Landroid/widget/TextView;

    if-nez p0, :cond_2

    const-string p0, "tvPower"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, p0

    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_3
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

    const v0, 0x7f0a1906

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->viewUnpaired:Landroid/view/View;

    const v0, 0x7f0a18fe

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->viewPaired:Landroid/view/View;

    const/4 v1, 0x0

    const-string v2, "viewPaired"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v3, "getContext(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->mContext:Landroid/content/Context;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->viewPaired:Landroid/view/View;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    const v3, 0x7f0a0626

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v3, "findViewById(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->ivDevice:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->viewPaired:Landroid/view/View;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    const v4, 0x7f0a0cc7

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/item/InfoItem;->setTvName(Landroid/widget/TextView;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->viewPaired:Landroid/view/View;

    if-nez v0, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_3
    const v4, 0x7f0a0623

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->ivConnection:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->viewPaired:Landroid/view/View;

    if-nez v0, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_4
    const v4, 0x7f0a065e

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->ivPower:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->viewPaired:Landroid/view/View;

    if-nez v0, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v1, v0

    :goto_0
    const v0, 0x7f0a0cea

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->tvPower:Landroid/widget/TextView;

    const v0, 0x7f0a01d9

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->btnMultiDevice:Landroid/view/View;

    if-eqz p1, :cond_6

    new-instance v0, Lcom/android/mltcode/paycertificationapi/f5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/f5;-><init>(Lcom/sma/smartv3/ui/device/item/InfoItem;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    return-void
.end method

.method public final getBtnMultiDevice()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->btnMultiDevice:Landroid/view/View;

    return-object v0
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->initEvent:Z

    return v0
.end method

.method public final getMOnClickListener()Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->mOnClickListener:Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;

    return-object v0
.end method

.method public final getTvName()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->tvName:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tvName"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initView()V
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->btnMultiDevice:Landroid/view/View;

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/i72;->XIIIO()Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->tvPower:Landroid/widget/TextView;

    const-string v3, "tvPower"

    const/4 v4, 0x0

    if-nez v0, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v4

    :cond_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->ivPower:Landroid/widget/ImageView;

    const-string v5, "ivPower"

    if-nez v0, :cond_3

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v4

    :cond_3
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result v6

    const-string v7, "viewUnpaired"

    const-string v8, "viewPaired"

    if-eqz v6, :cond_a

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->viewPaired:Landroid/view/View;

    if-nez v6, :cond_4

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v4

    :cond_4
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->viewUnpaired:Landroid/view/View;

    if-nez v6, :cond_5

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v4

    :cond_5
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/InfoItem;->getTvName()Landroid/widget/TextView;

    move-result-object v1

    sget-object v6, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/q62;->O1O()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->ivConnection:Landroid/widget/ImageView;

    if-nez v1, :cond_6

    const-string v1, "ivConnection"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v4

    :cond_6
    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v7

    invoke-virtual {v1, v7}, Landroid/view/View;->setEnabled(Z)V

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/device/item/InfoItem;->onPairImageChange(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_9

    iget v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->mCurPower:I

    if-lez v0, :cond_9

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->ivPower:Landroid/widget/ImageView;

    if-nez v0, :cond_7

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v4

    :cond_7
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/q62;->IIiiIiXiI()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->tvPower:Landroid/widget/TextView;

    if-nez v0, :cond_8

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    move-object v4, v0

    :goto_1
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_9
    return-void

    :cond_a
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->viewUnpaired:Landroid/view/View;

    if-nez v0, :cond_b

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v4

    :cond_b
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->viewPaired:Landroid/view/View;

    if-nez v0, :cond_c

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_c
    move-object v4, v0

    :goto_2
    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d029e

    return v0
.end method

.method public onAttach(Lcom/angcyo/dsladapter/DslViewHolder;I)V
    .locals 8
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->onAttach(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    :try_start_0
    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/InfoItem$XIi00iiXO;

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object v1, Lcom/szabh/smable3/BleKey;->POWER:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public onDetach(Lcom/angcyo/dsladapter/DslViewHolder;I)V
    .locals 2
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/InfoItem$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-super {p0, p1, p2}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->onDetach(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    return-void
.end method

.method public final onPairImageChange(Ljava/lang/Object;)V
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "pair_image_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onPairImageChange"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/uz0;->IXOIIIO(Lcom/android/mltcode/paycertificationapi/sz0;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v2

    const-string v3, "mContext"

    const-string v4, "ivDevice"

    if-eqz v2, :cond_3

    :try_start_0
    iget-object v2, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->ivDevice:Landroid/widget/ImageView;

    if-nez v2, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v0

    :cond_0
    invoke-static {p1}, Lcom/blankj/utilcode/util/ImageUtils;->getBitmap(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->ivDevice:Landroid/widget/ImageView;

    if-nez p1, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    iget-object v2, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->mContext:Landroid/content/Context;

    if-nez v2, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v0

    :cond_2
    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-static {v3, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/q62;->IXXOO(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->ivDevice:Landroid/widget/ImageView;

    if-nez p1, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_4
    iget-object v2, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->mContext:Landroid/content/Context;

    if-nez v2, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v0

    :cond_5
    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-static {v3, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/q62;->IXXOO(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setBtnMultiDevice(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->btnMultiDevice:Landroid/view/View;

    return-void
.end method

.method public final setMOnClickListener(Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->mOnClickListener:Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;

    return-void
.end method

.method public final setOnClickListener(Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->mOnClickListener:Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;

    return-void
.end method

.method public final setTvName(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/InfoItem;->tvName:Landroid/widget/TextView;

    return-void
.end method
