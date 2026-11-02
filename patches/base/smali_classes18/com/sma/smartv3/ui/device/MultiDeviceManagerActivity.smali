.class public Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultiDeviceManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiDeviceManagerActivity.kt\ncom/sma/smartv3/ui/device/MultiDeviceManagerActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n140#2,5:269\n145#2,5:275\n140#2,5:280\n145#2,5:286\n1#3:274\n1#3:285\n*S KotlinDebug\n*F\n+ 1 MultiDeviceManagerActivity.kt\ncom/sma/smartv3/ui/device/MultiDeviceManagerActivity\n*L\n224#1:269,5\n224#1:275,5\n227#1:280,5\n227#1:286,5\n224#1:274\n227#1:285\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMultiDeviceManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiDeviceManagerActivity.kt\ncom/sma/smartv3/ui/device/MultiDeviceManagerActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n140#2,5:269\n145#2,5:275\n140#2,5:280\n145#2,5:286\n1#3:274\n1#3:285\n*S KotlinDebug\n*F\n+ 1 MultiDeviceManagerActivity.kt\ncom/sma/smartv3/ui/device/MultiDeviceManagerActivity\n*L\n224#1:269,5\n224#1:275,5\n227#1:280,5\n227#1:286,5\n224#1:274\n227#1:285\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private connectingDeviceAddress:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private connectingDeviceName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pv0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/pv0;-><init>(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$OXO1;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->connectingDeviceName:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->connectingDeviceAddress:Ljava/lang/String;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->showList$lambda$0(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getConnectingDeviceAddress$p(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->connectingDeviceAddress:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getConnectingDeviceName$p(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->connectingDeviceName:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getMContext(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setConnectingDeviceAddress$p(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->connectingDeviceAddress:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setConnectingDeviceName$p(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->connectingDeviceName:Ljava/lang/String;

    return-void
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private static final showList$lambda$0(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 5

    const-string v0, "$this$renderAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p2, v0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;

    invoke-direct {v3, p2}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;-><init>(Lcom/szabh/smable3/entity/BleDeviceInfo;)V

    new-instance v4, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$XIi00iiXO;

    invoke-direct {v4, p0, p2}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Lcom/szabh/smable3/entity/BleDeviceInfo;)V

    invoke-virtual {v3, v4}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->setOnClickListener(Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem$OXO1;)V

    invoke-static {v0, v3, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public adapterStatusItem()Lcom/angcyo/dsladapter/DslAdapterStatusItem;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/dsl/AdapterStatusItem;

    invoke-direct {v0}, Lcom/sma/smartv3/dsl/AdapterStatusItem;-><init>()V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->setAdapterStatus(Lcom/angcyo/dsladapter/DslAdapterStatusItem;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getAdapterStatus()Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    move-result-object v0

    return-object v0
.end method

.method public final checkBluetoothIsOpenThenConnect(Lcom/szabh/smable3/entity/BleDeviceInfo;)V
    .locals 6
    .param p1    # Lcom/szabh/smable3/entity/BleDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.bluetooth.adapter.action.REQUEST_ENABLE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x3ea

    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;

    const/4 v2, 0x0

    invoke-direct {v3, p1, p0, v2}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;-><init>(Lcom/szabh/smable3/entity/BleDeviceInfo;Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public final connectedThirdDevice(Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;)Lkotlinx/coroutines/XiOIO;
    .locals 7
    .param p1    # Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "a2dpInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;-><init>(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    return-object p1
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140fca

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f080ff8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f06074b

    invoke-static {p0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    sget-object v0, Lcom/sma/smartv3/dto/OXO1;->I0iXXO:Lcom/sma/smartv3/dto/OXO1$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/dto/OXO1$OXO1;->XOO0ii0()Z

    move-result v1

    invoke-virtual {v0}, Lcom/sma/smartv3/dto/OXO1$OXO1;->XIi00iiXO()Lcom/sma/smartv3/dto/OXO1;

    move-result-object v0

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ThirdDevice:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " cached:"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/ov0;->OXO1:Lcom/android/mltcode/paycertificationapi/ov0;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BleCache;->getMDeviceInfo()Lcom/szabh/smable3/entity/BleDeviceInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/ov0;->OXO1(Lcom/szabh/smable3/entity/BleDeviceInfo;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ov0;->iO()V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ov0;->OIi0()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->showList(Ljava/util/List;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00cc

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    sget-object p3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "multiDevice -> onActivityResult: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 p3, -0x1

    if-ne p2, p3, :cond_0

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->onCodePairChange(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final onCodePairChange(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "code_pair_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onCodePairChange"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/ov0;->OXO1:Lcom/android/mltcode/paycertificationapi/ov0;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/ov0;->OIi0()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->showList(Ljava/util/List;)V

    return-void

    :cond_0
    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$OXO1;

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

.method public onTitleRightClick(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/ov0;->OXO1:Lcom/android/mltcode/paycertificationapi/ov0;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/ov0;->XO0O10()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->Oii1I1I10()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/device/AddDeviceActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_1
    const p1, 0x7f140fcb

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public final refreshDeviceState(Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "THIRD_PARTY_DEVICE_STATE_CHANGE"
    .end annotation

    const-string v0, "a2dpInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->connectedThirdDevice(Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public refreshLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final refreshList(Ljava/lang/Object;)V
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "bind_stage_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->O00()Lcom/android/mltcode/paycertificationapi/g10;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$refreshList$1;

    const/4 p1, 0x0

    invoke-direct {v4, p0, p1}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$refreshList$1;-><init>(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public showList(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleDeviceInfo;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->resetItem(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qv0;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/qv0;-><init>(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->notifyDataChanged()V

    return-void
.end method
