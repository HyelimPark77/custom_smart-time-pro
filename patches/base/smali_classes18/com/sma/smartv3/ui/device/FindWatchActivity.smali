.class public final Lcom/sma/smartv3/ui/device/FindWatchActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final bleHandleCallback:Lcom/sma/smartv3/ui/device/FindWatchActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mImageButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private start:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Xi1XX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Xi1XX;-><init>(Lcom/sma/smartv3/ui/device/FindWatchActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FindWatchActivity;->mImageButton$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/FindWatchActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FindWatchActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/FindWatchActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FindWatchActivity;->bleHandleCallback:Lcom/sma/smartv3/ui/device/FindWatchActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/FindWatchActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/FindWatchActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/FindWatchActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/FindWatchActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FindWatchActivity;->mImageButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FindWatchActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method private final getMImageButton()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FindWatchActivity;->mImageButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/FindWatchActivity;Landroid/view/View;)V
    .locals 8

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/device/FindWatchActivity;->start:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/FindWatchActivity;->start:Z

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "start.toInt() = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->FIND_WATCH:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/device/FindWatchActivity;->start:Z

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result v3

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/FindWatchActivity;->showImage()V

    return-void
.end method

.method private static final mImageButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FindWatchActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a03cf

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method


# virtual methods
.method public final getStart()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/FindWatchActivity;->start:Z

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FindWatchActivity;->bleHandleCallback:Lcom/sma/smartv3/ui/device/FindWatchActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XI1OX0IO()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f140be0

    const v1, 0x7f140be1

    goto :goto_0

    :cond_0
    const v0, 0x7f140be2

    const v1, 0x7f140bdf

    :goto_0
    const v2, 0x7f0a188f

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_1

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_1
    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/FindWatchActivity;->showImage()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FindWatchActivity;->getMImageButton()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OOXXOX0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OOXXOX0;-><init>(Lcom/sma/smartv3/ui/device/FindWatchActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d009e

    return v0
.end method

.method public onDestroy()V
    .locals 8

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->FIND_WATCH:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/4 v3, 0x0

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result v3

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FindWatchActivity;->bleHandleCallback:Lcom/sma/smartv3/ui/device/FindWatchActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

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

.method public final setStart(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/FindWatchActivity;->start:Z

    return-void
.end method

.method public final showImage()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FindWatchActivity;->getMImageButton()Landroid/widget/ImageView;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/device/FindWatchActivity;->start:Z

    if-eqz v1, :cond_0

    const v1, 0x7f08129f

    goto :goto_0

    :cond_0
    const v1, 0x7f0812a0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method
