.class public final Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;
.super Lcom/sma/smartv3/otherdevice/charge/BaseChargeActivity;
.source "SourceFile"


# instance fields
.field private final btnEqMode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnEqReset$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mEqSeekBarAdapter:Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mOnClickListener:Landroid/view/View$OnClickListener;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvEqModeSelectName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final wvFreq$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseChargeActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/so4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/so4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->wvFreq$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/to4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/to4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->tvEqModeSelectName$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uo4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uo4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->btnEqReset$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vo4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/vo4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->btnEqMode$delegate:Lkotlin/Lazy;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/XIXi00OX;->XOO0ii0()Lcom/jieli/jl_rcsp/model/device/EqInfo;

    move-result-object v0

    const-string v1, "getCurrentCacheEqInfo(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    new-instance v0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity$OXO1;-><init>(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mBleHandleCallback:Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity$OXO1;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wo4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wo4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mOnClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;Lcom/jieli/jl_rcsp/model/device/EqInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mOnClickListener$lambda$0$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;ILcom/jieli/jl_rcsp/model/device/EqInfo;Z)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;ILcom/jieli/jl_rcsp/model/device/EqInfo;Z)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->tvEqModeSelectName_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->btnEqMode_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->wvFreq_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->btnEqReset_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mOnClickListener$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getMEqInfo$p(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)Lcom/jieli/jl_rcsp/model/device/EqInfo;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    return-object p0
.end method

.method public static final synthetic access$setMEqInfo$p(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;Lcom/jieli/jl_rcsp/model/device/EqInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    return-void
.end method

.method public static final synthetic access$toEqInfo(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;)Lcom/jieli/jl_rcsp/model/device/EqInfo;
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->toEqInfo(Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;)Lcom/jieli/jl_rcsp/model/device/EqInfo;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateEqInfo(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;Lcom/jieli/jl_rcsp/model/device/EqInfo;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->updateEqInfo(Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    return-void
.end method

.method private static final btnEqMode_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01cb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final btnEqReset_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01cc

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final bytes2ints([BI)[I
    .locals 3

    new-array v0, p2, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    aget-byte v2, p1, v1

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final getBtnEqMode()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->btnEqMode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getBtnEqReset()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->btnEqReset$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getTvEqModeSelectName()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->tvEqModeSelectName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getWvFreq()Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->wvFreq$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;

    return-object v0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;ILcom/jieli/jl_rcsp/model/device/EqInfo;Z)V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->getWvFreq()Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getValue()[B

    move-result-object v1

    aget-byte v1, v1, p1

    invoke-virtual {v0, p1, v1}, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->IiI10X(II)V

    if-eqz p3, :cond_0

    const/4 p1, 0x6

    invoke-virtual {p2, p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setMode(I)V

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0, p2}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->setEqInfo(Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    :cond_0
    return-void
.end method

.method private static final mOnClickListener$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->getBtnEqMode()Landroid/widget/Button;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/qo4;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/qo4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)V

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;->newInstance(Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$XIi00iiXO;)Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    const-class v0, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->getBtnEqReset()Landroid/widget/Button;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/XIXi00OX;->OIX0iXi()Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->getEqInfos()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->copy()Lcom/jieli/jl_rcsp/model/device/EqInfo;

    move-result-object p1

    const/4 v0, 0x6

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setMode(I)V

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getValue()[B

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [B

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setValue([B)V

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->setEqInfo(Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    :cond_1
    return-void
.end method

.method private static final mOnClickListener$lambda$0$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;Lcom/jieli/jl_rcsp/model/device/EqInfo;)V
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->setEqInfo(Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    return-void
.end method

.method private final requestEqInfo()V
    .locals 8

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->EARPHONE_SOUND_EFFECTS_SET:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    return-void
.end method

.method private final setEqInfo(Lcom/jieli/jl_rcsp/model/device/EqInfo;)V
    .locals 9

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->EARPHONE_SOUND_EFFECTS_SET:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v3, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getMode()I

    move-result v4

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->isDynamic()Z

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result v5

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getValue()[B

    move-result-object v6

    const-string v7, "getValue(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getFreqs()[I

    move-result-object v7

    const-string v8, "getFreqs(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getCount()I

    move-result v8

    invoke-direct/range {v3 .. v8}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;-><init>(II[B[II)V

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getMode()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/XIXi00OX;->OIX0iXi()Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->getEqInfos()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getValue()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setValue([B)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/XIXi00OX;->X1ii(Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;)V

    :cond_0
    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/XIXi00OX;->XXI(Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->updateEqInfo(Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    return-void
.end method

.method private final toEqInfo(Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;)Lcom/jieli/jl_rcsp/model/device/EqInfo;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/EqInfo;-><init>()V

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->getMMode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setMode(I)V

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->getMValue()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setValue([B)V

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->getMFreqs()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setFreqs([I)V

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->getMDynamic()I

    move-result p1

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setDynamic(Z)V

    return-object v0
.end method

.method private static final tvEqModeSelectName_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c79

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final updateEqInfo(Lcom/jieli/jl_rcsp/model/device/EqInfo;)V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateEqInfo -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->getTvEqModeSelectName()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f03001e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getMode()I

    move-result v2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->getWvFreq()Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getValue()[B

    move-result-object v1

    const-string v2, "getValue(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getValue()[B

    move-result-object v3

    array-length v3, v3

    invoke-direct {p0, v1, v3}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->bytes2ints([BI)[I

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->setData([I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->getWvFreq()Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getFreqs()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->setFreqs([I)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mEqSeekBarAdapter:Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->copy()Lcom/jieli/jl_rcsp/model/device/EqInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;->updateSeekBar(Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getMode()I

    move-result v0

    const/4 v1, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v0, v1, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getValue()[B

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    move v1, v3

    :goto_1
    if-ge v1, v0, :cond_2

    aget-byte v2, p1, v1

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_2
    xor-int/lit8 v0, v3, 0x1

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->getBtnEqReset()Landroid/widget/Button;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->getBtnEqReset()Landroid/widget/Button;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method

.method private static final wvFreq_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;
    .locals 1

    const v0, 0x7f0a1955

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mBleHandleCallback:Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 3

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f14127c

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const v0, 0x7f0a0020

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f14127d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    new-instance v0, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/ro4;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/ro4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;)V

    invoke-direct {v0, p0, v1, v2}, Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter$OXO1;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mEqSeekBarAdapter:Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;

    const v0, 0x7f0a09d4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mEqSeekBarAdapter:Lcom/sma/smartv3/otherdevice/jl/adapter/EqSeekBarAdapter;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->updateEqInfo(Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->requestEqInfo()V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->getBtnEqMode()Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->getBtnEqReset()Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d010b

    return v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity;->mBleHandleCallback:Lcom/sma/smartv3/otherdevice/charge/SoundEffectsActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

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
