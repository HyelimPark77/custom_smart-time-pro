.class public Lcom/sma/smartv3/ui/device/item/EarphoneItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/item/EarphoneItem$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEarphoneItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EarphoneItem.kt\ncom/sma/smartv3/ui/device/item/EarphoneItem\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,194:1\n27#2:195\n*S KotlinDebug\n*F\n+ 1 EarphoneItem.kt\ncom/sma/smartv3/ui/device/item/EarphoneItem\n*L\n173#1:195\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEarphoneItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EarphoneItem.kt\ncom/sma/smartv3/ui/device/item/EarphoneItem\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,194:1\n27#2:195\n*S KotlinDebug\n*F\n+ 1 EarphoneItem.kt\ncom/sma/smartv3/ui/device/item/EarphoneItem\n*L\n173#1:195\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final handler:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final initEvent:Z

.field public ivConnection:Landroid/widget/ImageView;

.field public ivDevice:Landroid/widget/ImageView;

.field public ivLeftPower:Landroid/widget/ImageView;

.field public ivRightPower:Landroid/widget/ImageView;

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/EarphoneItem$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private final switchStatusRunnable$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public tvLeftPower:Landroid/widget/TextView;

.field public tvName:Landroid/widget/TextView;

.field public tvRightPower:Landroid/widget/TextView;

.field public tvVersion:Landroid/widget/TextView;

.field private viewPaired:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    const-string v0, "EarphoneItem"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->TAG:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->initEvent:Z

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->handler:Landroid/os/Handler;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOOIi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOOIi;-><init>(Lcom/sma/smartv3/ui/device/item/EarphoneItem;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->switchStatusRunnable$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/item/EarphoneItem$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/item/EarphoneItem;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/EarphoneItem$XIi00iiXO;

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/device/item/EarphoneItem;)Ljava/lang/Runnable;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->switchStatusRunnable_delegate$lambda$0(Lcom/sma/smartv3/ui/device/item/EarphoneItem;)Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/device/item/EarphoneItem;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->switchStatusRunnable_delegate$lambda$0$0(Lcom/sma/smartv3/ui/device/item/EarphoneItem;)V

    return-void
.end method

.method public static final synthetic access$getHandler$p(Lcom/sma/smartv3/ui/device/item/EarphoneItem;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getSwitchStatusRunnable(Lcom/sma/smartv3/ui/device/item/EarphoneItem;)Ljava/lang/Runnable;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->getSwitchStatusRunnable()Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$initEarphonePower(Lcom/sma/smartv3/ui/device/item/EarphoneItem;Lcom/szabh/smable3/entity/BleEarphonePower;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->initEarphonePower(Lcom/szabh/smable3/entity/BleEarphonePower;)V

    return-void
.end method

.method private final getSwitchStatusRunnable()Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->switchStatusRunnable$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    return-object v0
.end method

.method private final initEarphonePower(Lcom/szabh/smable3/entity/BleEarphonePower;)V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " initEarphonePower  earphonePower = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->getIvLeftPower()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->getTvLeftPower()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleEarphonePower;->getMLeftPower()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "%"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->getIvRightPower()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->getTvRightPower()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleEarphonePower;->getMRightPower()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final switchStatusRunnable_delegate$lambda$0(Lcom/sma/smartv3/ui/device/item/EarphoneItem;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iI10iiiiX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iI10iiiiX;-><init>(Lcom/sma/smartv3/ui/device/item/EarphoneItem;)V

    return-object v0
.end method

.method private static final switchStatusRunnable_delegate$lambda$0$0(Lcom/sma/smartv3/ui/device/item/EarphoneItem;)V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->getIvConnection()Landroid/widget/ImageView;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 4
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a18fe

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->viewPaired:Landroid/view/View;

    const/4 v0, 0x0

    const-string v1, "viewPaired"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v2, "getContext(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->mContext:Landroid/content/Context;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->viewPaired:Landroid/view/View;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    const v2, 0x7f0a0626

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v2, "findViewById(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->setIvDevice(Landroid/widget/ImageView;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->viewPaired:Landroid/view/View;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_2
    const v3, 0x7f0a0cc7

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->setTvName(Landroid/widget/TextView;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->viewPaired:Landroid/view/View;

    if-nez p1, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_3
    const v3, 0x7f0a0623

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->setIvConnection(Landroid/widget/ImageView;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->viewPaired:Landroid/view/View;

    if-nez p1, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_4
    const v3, 0x7f0a18b1

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->setTvVersion(Landroid/widget/TextView;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->viewPaired:Landroid/view/View;

    if-nez p1, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_5
    const v3, 0x7f0a0331

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->setIvLeftPower(Landroid/widget/ImageView;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->viewPaired:Landroid/view/View;

    if-nez p1, :cond_6

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_6
    const v3, 0x7f0a0c9f

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->setTvLeftPower(Landroid/widget/TextView;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->viewPaired:Landroid/view/View;

    if-nez p1, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_7
    const v3, 0x7f0a0332

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->setIvRightPower(Landroid/widget/ImageView;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->viewPaired:Landroid/view/View;

    if-nez p1, :cond_8

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_8
    const v3, 0x7f0a0cf3

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->setTvRightPower(Landroid/widget/TextView;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->viewPaired:Landroid/view/View;

    if-nez p1, :cond_9

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_9
    move-object v0, p1

    :goto_0
    const/16 p1, 0x8

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->initEvent:Z

    return v0
.end method

.method public final getIvConnection()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->ivConnection:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "ivConnection"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getIvDevice()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->ivDevice:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "ivDevice"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getIvLeftPower()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->ivLeftPower:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "ivLeftPower"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getIvRightPower()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->ivRightPower:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "ivRightPower"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTAG()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public final getTvLeftPower()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->tvLeftPower:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tvLeftPower"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTvName()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->tvName:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tvName"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTvRightPower()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->tvRightPower:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tvRightPower"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTvVersion()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->tvVersion:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tvVersion"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initView()V
    .locals 10

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XiO1I()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XiO1I()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->viewPaired:Landroid/view/View;

    if-nez v0, :cond_0

    const-string v0, "viewPaired"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->tvVersion:Landroid/widget/TextView;

    if-eqz v0, :cond_b

    sget-object v4, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v5, Lcom/szabh/smable3/BleKey;->EARPHONE_STATE:Lcom/szabh/smable3/BleKey;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-class v6, Lcom/szabh/smable3/entity/BleEarphoneState;

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleEarphoneState;

    sget-object v5, Lcom/szabh/smable3/BleKey;->EARPHONE_INFO:Lcom/szabh/smable3/BleKey;

    const-class v6, Lcom/szabh/smable3/entity/BleEarphoneInfo;

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/szabh/smable3/entity/BleEarphoneInfo;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " initView  earphoneState = "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "  earphoneInfo = "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->tvName:Landroid/widget/TextView;

    if-eqz v5, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->getTvName()Landroid/widget/TextView;

    move-result-object v5

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleEarphoneInfo;->getMBleName()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_2
    move-object v6, v3

    :goto_0
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleEarphoneInfo;->getMFirmwareVersion()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_4
    move-object v5, v3

    :goto_1
    const-string v6, ""

    if-eqz v5, :cond_7

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleEarphoneInfo;->getMFirmwareVersion()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_5
    move-object v5, v3

    :goto_2
    const-string v7, "0.0.0"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->getTvVersion()Landroid/widget/TextView;

    move-result-object v5

    const v7, 0x7f14040b

    invoke-static {v7}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v7

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleEarphoneInfo;->getMFirmwareVersion()Ljava/lang/String;

    move-result-object v3

    :cond_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ":"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_7
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->getTvVersion()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->getIvConnection()Landroid/widget/ImageView;

    move-result-object v3

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneState;->getMLeftState()I

    move-result v4

    if-ne v4, v2, :cond_8

    goto :goto_4

    :cond_8
    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneState;->getMRightState()I

    move-result v0

    if-ne v0, v2, :cond_9

    goto :goto_4

    :cond_9
    move v2, v1

    :goto_4
    invoke-virtual {v3, v2}, Landroid/view/View;->setEnabled(Z)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->getIvLeftPower()Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->getIvRightPower()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->getTvLeftPower()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->getTvRightPower()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_a
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->onPairImageAttachmentChange(Ljava/lang/Object;)V

    :cond_b
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d028b

    return v0
.end method

.method public onAttach(Lcom/angcyo/dsladapter/DslViewHolder;I)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->onAttach(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    :try_start_0
    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/EarphoneItem$XIi00iiXO;

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
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

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/EarphoneItem$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-super {p0, p1, p2}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->onDetach(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    return-void
.end method

.method public final onPairImageAttachmentChange(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "pair_image_change_attachment"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onPairImageAttachmentChange"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/uz0;->IXI(Lcom/android/mltcode/paycertificationapi/sz0;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->getIvDevice()Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {p1}, Lcom/blankj/utilcode/util/ImageUtils;->getBitmap(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string v2, "getBitmap(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->mContext:Landroid/content/Context;

    if-nez v2, :cond_0

    const-string v2, "mContext"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "getResources(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v2, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method public final setIvConnection(Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->ivConnection:Landroid/widget/ImageView;

    return-void
.end method

.method public final setIvDevice(Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->ivDevice:Landroid/widget/ImageView;

    return-void
.end method

.method public final setIvLeftPower(Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->ivLeftPower:Landroid/widget/ImageView;

    return-void
.end method

.method public final setIvRightPower(Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->ivRightPower:Landroid/widget/ImageView;

    return-void
.end method

.method public final setTvLeftPower(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->tvLeftPower:Landroid/widget/TextView;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->tvName:Landroid/widget/TextView;

    return-void
.end method

.method public final setTvRightPower(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->tvRightPower:Landroid/widget/TextView;

    return-void
.end method

.method public final setTvVersion(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/EarphoneItem;->tvVersion:Landroid/widget/TextView;

    return-void
.end method
