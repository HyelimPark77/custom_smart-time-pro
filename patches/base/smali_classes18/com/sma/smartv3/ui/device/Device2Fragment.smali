.class public Lcom/sma/smartv3/ui/device/Device2Fragment;
.super Lcom/sma/smartv3/ui/device/DeviceFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDevice2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,389:1\n151#2,5:390\n156#2,5:396\n1#3:395\n*S KotlinDebug\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment\n*L\n383#1:390,5\n383#1:396,5\n383#1:395\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDevice2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,389:1\n151#2,5:390\n156#2,5:396\n1#3:395\n*S KotlinDebug\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment\n*L\n383#1:390,5\n383#1:396,5\n383#1:395\n*E\n"
    }
.end annotation


# instance fields
.field private addMarginTop:Z

.field private final info2Item$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDropDownPopup:Landroid/widget/PopupWindow;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/Device2Fragment;->addMarginTop:Z

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXiXX1O0I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXiXX1O0I;-><init>(Lcom/sma/smartv3/ui/device/Device2Fragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/Device2Fragment;->info2Item$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic IXXI1(Lcom/sma/smartv3/ui/device/Device2Fragment;Landroid/view/View;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/Device2Fragment;->showDropDownPopup$lambda$1(Lcom/sma/smartv3/ui/device/Device2Fragment;Landroid/view/View;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Ii1X(Lcom/sma/smartv3/ui/device/Device2Fragment;Landroid/view/View;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/Device2Fragment;->showDropDownPopup$lambda$0(Lcom/sma/smartv3/ui/device/Device2Fragment;Landroid/view/View;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01I0(Lcom/sma/smartv3/ui/device/Device2Fragment;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/Device2Fragment;->showDropDownPopup$lambda$2$0(Lcom/sma/smartv3/ui/device/Device2Fragment;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMActivity(Lcom/sma/smartv3/ui/device/Device2Fragment;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method private final getInfo2Item()Lcom/sma/smartv3/ui/device/item/Info2Item;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/Device2Fragment;->info2Item$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/device/item/Info2Item;

    return-object v0
.end method

.method public static synthetic i1IIX0iX(Lcom/sma/smartv3/ui/device/Device2Fragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/Device2Fragment;->showDropDownPopup$lambda$2(Lcom/sma/smartv3/ui/device/Device2Fragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iXOOOO0X0(Lcom/sma/smartv3/ui/device/Device2Fragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/Device2Fragment;->showDropDownPopup$lambda$3(Lcom/sma/smartv3/ui/device/Device2Fragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iXOXii(Lcom/sma/smartv3/ui/device/Device2Fragment;)Lcom/sma/smartv3/ui/device/item/Info2Item;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/Device2Fragment;->info2Item_delegate$lambda$0(Lcom/sma/smartv3/ui/device/Device2Fragment;)Lcom/sma/smartv3/ui/device/item/Info2Item;

    move-result-object p0

    return-object p0
.end method

.method private static final info2Item_delegate$lambda$0(Lcom/sma/smartv3/ui/device/Device2Fragment;)Lcom/sma/smartv3/ui/device/item/Info2Item;
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/device/item/Info2Item;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/item/Info2Item;-><init>()V

    new-instance v1, Lcom/sma/smartv3/ui/device/Device2Fragment$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/Device2Fragment$OXO1;-><init>(Lcom/sma/smartv3/ui/device/Device2Fragment;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/item/InfoItem;->setOnClickListener(Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;)V

    return-object v0
.end method

.method private static final showDropDownPopup$lambda$0(Lcom/sma/smartv3/ui/device/Device2Fragment;Landroid/view/View;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/Device2Fragment;->showDropDownPopup(Landroid/view/View;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showDropDownPopup$lambda$1(Lcom/sma/smartv3/ui/device/Device2Fragment;Landroid/view/View;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/Device2Fragment;->showDropDownPopup(Landroid/view/View;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showDropDownPopup$lambda$2(Lcom/sma/smartv3/ui/device/Device2Fragment;Landroid/view/View;)V
    .locals 6

    const-string p1, "STORAGE"

    const-string v0, "CAMERA"

    filled-new-array {p1, v0}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v0

    const-string p1, "permission(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/iO0X011X0;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/iO0X011X0;-><init>(Lcom/sma/smartv3/ui/device/Device2Fragment;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method private static final showDropDownPopup$lambda$2$0(Lcom/sma/smartv3/ui/device/Device2Fragment;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/Device2Fragment;->mDropDownPopup:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->scanQrcode()V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showDropDownPopup$lambda$3(Lcom/sma/smartv3/ui/device/Device2Fragment;Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/Device2Fragment;->mDropDownPopup:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/DeviceFragment;->setBindDevice(Z)V

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const-class v2, Lcom/sma/smartv3/ui/device/AddDeviceActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0, p1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method public final getAddMarginTop()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/Device2Fragment;->addMarginTop:Z

    return v0
.end method

.method public getBCItems()Ljava/util/List;
    .locals 11
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/angcyo/dsladapter/DslAdapterItem;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/Device2Fragment;->getInfo2Item()Lcom/sma/smartv3/ui/device/item/Info2Item;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/item/DeviceListItem;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;-><init>()V

    const v2, 0x7f140cb1

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setMTitle(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getHrMonitoringItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getBloodOxyGenItem()Lcom/sma/smartv3/ui/device/item/BloodOxyGenItem;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getPressureItem()Lcom/sma/smartv3/ui/device/item/PressureItem;

    move-result-object v4

    const/4 v5, 0x3

    new-array v6, v5, [Lcom/angcyo/dsladapter/DslAdapterItem;

    const/4 v7, 0x0

    aput-object v2, v6, v7

    const/4 v2, 0x1

    aput-object v3, v6, v2

    const/4 v3, 0x2

    aput-object v4, v6, v3

    invoke-static {v6}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setItems(Ljava/util/List;)V

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    new-instance v4, Lcom/sma/smartv3/ui/device/item/DeviceListItem;

    invoke-direct {v4}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;-><init>()V

    const v6, 0x7f140406

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setMTitle(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getFirmwareItem()Lcom/sma/smartv3/ui/device/item/FirmwareItem;

    move-result-object v6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getResetItem()Lcom/sma/smartv3/ui/device/item/ResetItem;

    move-result-object v8

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getShutdownItem()Lcom/sma/smartv3/ui/device/item/ShutdownItem;

    move-result-object v9

    new-array v10, v5, [Lcom/angcyo/dsladapter/DslAdapterItem;

    aput-object v6, v10, v7

    aput-object v8, v10, v2

    aput-object v9, v10, v3

    invoke-static {v10}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setItems(Ljava/util/List;)V

    new-instance v6, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;

    invoke-direct {v6}, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getUnpairItem()Lcom/sma/smartv3/ui/device/item/UnpairItem;

    move-result-object v8

    new-instance v9, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;

    invoke-direct {v9}, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;-><init>()V

    const/4 v10, 0x6

    new-array v10, v10, [Lcom/angcyo/dsladapter/DslAdapterItem;

    aput-object v0, v10, v7

    aput-object v1, v10, v2

    aput-object v4, v10, v3

    aput-object v6, v10, v5

    const/4 v0, 0x4

    aput-object v8, v10, v0

    const/4 v0, 0x5

    aput-object v9, v10, v0

    invoke-static {v10}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getItems()Ljava/util/List;
    .locals 60
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/angcyo/dsladapter/DslAdapterItem;",
            ">;"
        }
    .end annotation

    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/Device2Fragment;->getInfo2Item()Lcom/sma/smartv3/ui/device/item/Info2Item;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getEarphoneItem()Lcom/sma/smartv3/ui/device/item/EarphoneItem;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getGameStoreItem()Lcom/sma/smartv3/ui/device/item/GameStoreItem;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/item/DeviceListItem;

    invoke-direct {v3}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getClassicPairItem()Lcom/sma/smartv3/ui/device/item/ClassicPairItem;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getQiblaItem()Lcom/sma/smartv3/ui/device/item/QiblaItem;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getDialItem()Lcom/sma/smartv3/ui/device/item/DialItem;

    move-result-object v6

    const/4 v7, 0x3

    new-array v8, v7, [Lcom/angcyo/dsladapter/DslAdapterItem;

    const/4 v9, 0x0

    aput-object v4, v8, v9

    const/4 v4, 0x1

    aput-object v5, v8, v4

    const/4 v5, 0x2

    aput-object v6, v8, v5

    invoke-static {v8}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setItems(Ljava/util/List;)V

    sget-object v6, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    new-instance v6, Lcom/sma/smartv3/ui/device/item/DeviceListItem;

    invoke-direct {v6}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;-><init>()V

    const v8, 0x7f141040

    invoke-virtual {v6, v8}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setMTitle(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getMessagePushItem()Lcom/sma/smartv3/ui/device/item/MessagePushItem;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getIncomingCallItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getNoDisturbItem()Lcom/sma/smartv3/ui/device/item/NoDisturbItem;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getNoDisturb2Item()Lcom/sma/smartv3/ui/device/item/NoDisturb2Item;

    move-result-object v12

    const/4 v13, 0x4

    new-array v14, v13, [Lcom/angcyo/dsladapter/DslAdapterItem;

    aput-object v8, v14, v9

    aput-object v10, v14, v4

    aput-object v11, v14, v5

    aput-object v12, v14, v7

    invoke-static {v14}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {v6, v8}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setItems(Ljava/util/List;)V

    new-instance v8, Lcom/sma/smartv3/ui/device/item/DeviceListItem;

    invoke-direct {v8}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;-><init>()V

    const v10, 0x7f140cb1

    invoke-virtual {v8, v10}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setMTitle(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getHrMonitoringItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getEcgMonitoringItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getBloodOxyGenItem()Lcom/sma/smartv3/ui/device/item/BloodOxyGenItem;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getTempMonitoringItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getGirlCareItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getSedentarinessItem()Lcom/sma/smartv3/ui/device/item/SedentarinessItem;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getMedicationAlarmItem()Lcom/sma/smartv3/ui/device/item/MedicationAlarmItem;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getDrinkWaterItem()Lcom/sma/smartv3/ui/device/item/DrinkWaterItem;

    move-result-object v18

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getWashItem()Lcom/sma/smartv3/ui/device/item/WashItem;

    move-result-object v19

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getPressureItem()Lcom/sma/smartv3/ui/device/item/PressureItem;

    move-result-object v20

    move/from16 v21, v4

    const/16 v4, 0xa

    move/from16 v22, v5

    new-array v5, v4, [Lcom/angcyo/dsladapter/DslAdapterItem;

    aput-object v10, v5, v9

    aput-object v11, v5, v21

    aput-object v12, v5, v22

    aput-object v14, v5, v7

    aput-object v15, v5, v13

    const/4 v10, 0x5

    aput-object v16, v5, v10

    const/4 v11, 0x6

    aput-object v17, v5, v11

    const/4 v12, 0x7

    aput-object v18, v5, v12

    const/16 v14, 0x8

    aput-object v19, v5, v14

    const/16 v15, 0x9

    aput-object v20, v5, v15

    invoke-static {v5}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v8, v5}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setItems(Ljava/util/List;)V

    new-instance v5, Lcom/sma/smartv3/ui/device/item/DeviceListItem;

    invoke-direct {v5}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;-><init>()V

    move/from16 v16, v4

    const v4, 0x7f1403f7

    invoke-virtual {v5, v4}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setMTitle(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getMusicControlItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getRemoteCameraItem()Lcom/sma/smartv3/ui/device/item/RemoteCameraItem;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getAlarmClockItem()Lcom/sma/smartv3/ui/device/item/AlarmClockItem;

    move-result-object v18

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getScheduleItem()Lcom/sma/smartv3/ui/device/item/ScheduleItem;

    move-result-object v19

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getSyncContactItem()Lcom/sma/smartv3/ui/device/item/SyncContactItem;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getFindWatchItem()Lcom/sma/smartv3/ui/device/item/FindWatchItem;

    move-result-object v23

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getVoiceItem()Lcom/sma/smartv3/ui/device/item/VoiceItem;

    move-result-object v24

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getDialogueTranslation()Lcom/sma/smartv3/ui/device/item/TranslationDialogueItem;

    move-result-object v25

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getSimultaneousTranslation()Lcom/sma/smartv3/ui/device/item/TranslationSimultaneousItem;

    move-result-object v26

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getRecordingItem()Lcom/sma/smartv3/ui/device/item/RecordingItem;

    move-result-object v27

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getWorldClockItem()Lcom/sma/smartv3/ui/device/item/WorldClockItem;

    move-result-object v28

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getStockMarketItem()Lcom/sma/smartv3/ui/device/item/StockMarketItem;

    move-result-object v29

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getGameSettingsItem()Lcom/sma/smartv3/ui/device/item/GameSettingsItem;

    move-result-object v30

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getGameTimeSetItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v31

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getNavigationItem()Lcom/sma/smartv3/ui/device/item/NavigationItem;

    move-result-object v32

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getNucleicAcidCodeItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v33

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getMyCardCodeItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v34

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getMyCardCode2Item()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v35

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getReceiptCodeItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v36

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getReceiptCode2Item()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v37

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getOfflineMapsItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v38

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getAlipaySetItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v39

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getWechatPaySetItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v40

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getHardWareAlipay()Lcom/sma/smartv3/ui/device/item/HardWareAlipayItem;

    move-result-object v41

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getSosManagerItem()Lcom/sma/smartv3/ui/device/item/SOSManagerItem;

    move-result-object v42

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getAppStoreItem()Lcom/sma/smartv3/ui/device/item/AppStoreItem;

    move-result-object v43

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getAudioBookLearnItem()Lcom/sma/smartv3/ui/device/item/AudioBookLearnItem;

    move-result-object v44

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getNotificationLightScreenItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v45

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getLearnCardItem()Lcom/sma/smartv3/ui/device/item/LearnCardItem;

    move-result-object v46

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getLogoFileItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v47

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getMusicManagerItem()Lcom/sma/smartv3/ui/device/item/MusicManagerItem;

    move-result-object v48

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getEbookManagerItem()Lcom/sma/smartv3/ui/device/item/EBookManagerItem;

    move-result-object v49

    move/from16 v50, v7

    const/16 v7, 0x20

    new-array v7, v7, [Lcom/angcyo/dsladapter/DslAdapterItem;

    aput-object v4, v7, v9

    aput-object v17, v7, v21

    aput-object v18, v7, v22

    aput-object v19, v7, v50

    aput-object v20, v7, v13

    aput-object v23, v7, v10

    aput-object v24, v7, v11

    aput-object v25, v7, v12

    aput-object v26, v7, v14

    aput-object v27, v7, v15

    aput-object v28, v7, v16

    const/16 v4, 0xb

    aput-object v29, v7, v4

    const/16 v17, 0xc

    aput-object v30, v7, v17

    const/16 v18, 0xd

    aput-object v31, v7, v18

    const/16 v19, 0xe

    aput-object v32, v7, v19

    const/16 v20, 0xf

    aput-object v33, v7, v20

    const/16 v23, 0x10

    aput-object v34, v7, v23

    const/16 v24, 0x11

    aput-object v35, v7, v24

    const/16 v25, 0x12

    aput-object v36, v7, v25

    const/16 v26, 0x13

    aput-object v37, v7, v26

    const/16 v27, 0x14

    aput-object v38, v7, v27

    const/16 v28, 0x15

    aput-object v39, v7, v28

    const/16 v29, 0x16

    aput-object v40, v7, v29

    const/16 v29, 0x17

    aput-object v41, v7, v29

    const/16 v29, 0x18

    aput-object v42, v7, v29

    const/16 v29, 0x19

    aput-object v43, v7, v29

    const/16 v29, 0x1a

    aput-object v44, v7, v29

    const/16 v29, 0x1b

    aput-object v45, v7, v29

    const/16 v29, 0x1c

    aput-object v46, v7, v29

    const/16 v29, 0x1d

    aput-object v47, v7, v29

    const/16 v29, 0x1e

    aput-object v48, v7, v29

    const/16 v29, 0x1f

    aput-object v49, v7, v29

    invoke-static {v7}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setItems(Ljava/util/List;)V

    new-instance v7, Lcom/sma/smartv3/ui/device/item/DeviceListItem;

    invoke-direct {v7}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;-><init>()V

    move/from16 v29, v9

    const v9, 0x7f140406

    invoke-virtual {v7, v9}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setMTitle(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getGestureWakeItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getGestureWake2Item()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v30

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getShockItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v31

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getShockSettingsItem()Lcom/sma/smartv3/ui/device/item/ShockSettingsItem;

    move-result-object v32

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getBackLightItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v33

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getTimeFormatItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v34

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getDateFormatItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v35

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getMemoryManagerItem()Lcom/sma/smartv3/ui/device/item/MemoryManagerItem;

    move-result-object v36

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getSmsQuickReplyItem()Lcom/sma/smartv3/ui/device/item/SMSQuickReplyItem;

    move-result-object v37

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getMeasureUnitItem()Lcom/sma/smartv3/ui/device/item/MeasureUnitItem;

    move-result-object v38

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getWearWayItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v39

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getLanguageItem()Lcom/sma/smartv3/ui/device/item/LanguageItem;

    move-result-object v40

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getStandbySetItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v41

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getStandbyWatchFaceItem()Lcom/sma/smartv3/ui/device/item/StandbyWatchFaceItem;

    move-result-object v42

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getWatchPasswordItem()Lcom/sma/smartv3/ui/device/item/WatchPasswordItem;

    move-result-object v43

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getAntiLostItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v44

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getMacQrcodeItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v45

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getNfcGuideItem()Lcom/sma/smartv3/ui/device/item/NFCGuideItem;

    move-result-object v46

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getPowerSaveModeItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v47

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getTouchSetItem()Lcom/sma/smartv3/ui/device/item/TouchSetItem;

    move-result-object v48

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getFirmwareItem()Lcom/sma/smartv3/ui/device/item/FirmwareItem;

    move-result-object v49

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getAGPSUpgradeItem()Lcom/sma/smartv3/ui/device/item/AGPSUpgradeItem;

    move-result-object v51

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getLanguageUpdateItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v52

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getDoubleClickScreenItem()Lcom/sma/smartv3/ui/device/item/DoubleClickScreenItem;

    move-result-object v53

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getIncomingCallRingItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v54

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getWechatVerificationItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v55

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getIncomingCallRingVibrationItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v56

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getLanguageUpdateItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v57

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getResetItem()Lcom/sma/smartv3/ui/device/item/ResetItem;

    move-result-object v58

    move/from16 v59, v10

    const/16 v10, 0x1d

    new-array v10, v10, [Lcom/angcyo/dsladapter/DslAdapterItem;

    aput-object v9, v10, v29

    aput-object v30, v10, v21

    aput-object v31, v10, v22

    aput-object v32, v10, v50

    aput-object v33, v10, v13

    aput-object v34, v10, v59

    aput-object v35, v10, v11

    aput-object v36, v10, v12

    aput-object v37, v10, v14

    aput-object v38, v10, v15

    aput-object v39, v10, v16

    aput-object v40, v10, v4

    aput-object v41, v10, v17

    aput-object v42, v10, v18

    aput-object v43, v10, v19

    aput-object v44, v10, v20

    aput-object v45, v10, v23

    aput-object v46, v10, v24

    aput-object v47, v10, v25

    aput-object v48, v10, v26

    aput-object v49, v10, v27

    aput-object v51, v10, v28

    const/16 v9, 0x16

    aput-object v52, v10, v9

    const/16 v9, 0x17

    aput-object v53, v10, v9

    const/16 v9, 0x18

    aput-object v54, v10, v9

    const/16 v9, 0x19

    aput-object v55, v10, v9

    const/16 v9, 0x1a

    aput-object v56, v10, v9

    const/16 v9, 0x1b

    aput-object v57, v10, v9

    const/16 v9, 0x1c

    aput-object v58, v10, v9

    invoke-static {v10}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-virtual {v7, v9}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setItems(Ljava/util/List;)V

    new-instance v9, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;

    invoke-direct {v9}, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getUnpairItem()Lcom/sma/smartv3/ui/device/item/UnpairItem;

    move-result-object v10

    new-instance v17, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;

    invoke-direct/range {v17 .. v17}, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;-><init>()V

    new-array v4, v4, [Lcom/angcyo/dsladapter/DslAdapterItem;

    aput-object v0, v4, v29

    aput-object v1, v4, v21

    aput-object v2, v4, v22

    aput-object v3, v4, v50

    aput-object v6, v4, v13

    aput-object v8, v4, v59

    aput-object v5, v4, v11

    aput-object v7, v4, v12

    aput-object v9, v4, v14

    aput-object v10, v4, v15

    aput-object v17, v4, v16

    invoke-static {v4}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getRingItems()Ljava/util/List;
    .locals 14
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/angcyo/dsladapter/DslAdapterItem;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/Device2Fragment;->getInfo2Item()Lcom/sma/smartv3/ui/device/item/Info2Item;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getGameStoreItem()Lcom/sma/smartv3/ui/device/item/GameStoreItem;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/item/DeviceListItem;

    invoke-direct {v2}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;-><init>()V

    const v3, 0x7f140cb1

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setMTitle(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getHrMonitoringItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getBloodOxyGenItem()Lcom/sma/smartv3/ui/device/item/BloodOxyGenItem;

    move-result-object v4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getPressureItem()Lcom/sma/smartv3/ui/device/item/PressureItem;

    move-result-object v5

    const/4 v6, 0x3

    new-array v7, v6, [Lcom/angcyo/dsladapter/DslAdapterItem;

    const/4 v8, 0x0

    aput-object v3, v7, v8

    const/4 v3, 0x1

    aput-object v4, v7, v3

    const/4 v4, 0x2

    aput-object v5, v7, v4

    invoke-static {v7}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setItems(Ljava/util/List;)V

    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    new-instance v5, Lcom/sma/smartv3/ui/device/item/DeviceListItem;

    invoke-direct {v5}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;-><init>()V

    const v7, 0x7f140406

    invoke-virtual {v5, v7}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setMTitle(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getTouchSetItem()Lcom/sma/smartv3/ui/device/item/TouchSetItem;

    move-result-object v7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getFirmwareItem()Lcom/sma/smartv3/ui/device/item/FirmwareItem;

    move-result-object v9

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getResetItem()Lcom/sma/smartv3/ui/device/item/ResetItem;

    move-result-object v10

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getShutdownItem()Lcom/sma/smartv3/ui/device/item/ShutdownItem;

    move-result-object v11

    const/4 v12, 0x4

    new-array v13, v12, [Lcom/angcyo/dsladapter/DslAdapterItem;

    aput-object v7, v13, v8

    aput-object v9, v13, v3

    aput-object v10, v13, v4

    aput-object v11, v13, v6

    invoke-static {v13}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setItems(Ljava/util/List;)V

    new-instance v7, Lcom/sma/smartv3/ui/device/item/DeviceListItem;

    invoke-direct {v7}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getVideoUseHelpItem()Lcom/sma/smartv3/ui/device/item/AuraVideoUseHelpItem;

    move-result-object v9

    new-array v10, v3, [Lcom/angcyo/dsladapter/DslAdapterItem;

    aput-object v9, v10, v8

    invoke-static {v10}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-virtual {v7, v9}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setItems(Ljava/util/List;)V

    new-instance v9, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;

    invoke-direct {v9}, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getUnpairItem()Lcom/sma/smartv3/ui/device/item/UnpairItem;

    move-result-object v10

    new-instance v11, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;

    invoke-direct {v11}, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;-><init>()V

    const/16 v13, 0x8

    new-array v13, v13, [Lcom/angcyo/dsladapter/DslAdapterItem;

    aput-object v0, v13, v8

    aput-object v1, v13, v3

    aput-object v2, v13, v4

    aput-object v5, v13, v6

    aput-object v7, v13, v12

    const/4 v0, 0x5

    aput-object v9, v13, v0

    const/4 v0, 0x6

    aput-object v10, v13, v0

    const/4 v0, 0x7

    aput-object v11, v13, v0

    invoke-static {v13}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getScreenlessBraceletItems()Ljava/util/List;
    .locals 19
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/angcyo/dsladapter/DslAdapterItem;",
            ">;"
        }
    .end annotation

    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/Device2Fragment;->getInfo2Item()Lcom/sma/smartv3/ui/device/item/Info2Item;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/item/DeviceListItem;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;-><init>()V

    const v2, 0x7f140cb1

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setMTitle(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getHrMonitoringItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getBloodOxyGenItem()Lcom/sma/smartv3/ui/device/item/BloodOxyGenItem;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getPressureItem()Lcom/sma/smartv3/ui/device/item/PressureItem;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getHrvSetItem()Lcom/sma/smartv3/ui/device/item/HrvSetItem;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getTempMonitoringItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v6

    const/4 v7, 0x5

    new-array v8, v7, [Lcom/angcyo/dsladapter/DslAdapterItem;

    const/4 v9, 0x0

    aput-object v2, v8, v9

    const/4 v2, 0x1

    aput-object v3, v8, v2

    const/4 v3, 0x2

    aput-object v4, v8, v3

    const/4 v4, 0x3

    aput-object v5, v8, v4

    const/4 v5, 0x4

    aput-object v6, v8, v5

    invoke-static {v8}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setItems(Ljava/util/List;)V

    sget-object v6, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    new-instance v6, Lcom/sma/smartv3/ui/device/item/DeviceListItem;

    invoke-direct {v6}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;-><init>()V

    const v8, 0x7f1403f7

    invoke-virtual {v6, v8}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setMTitle(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getAlarmClockItem()Lcom/sma/smartv3/ui/device/item/AlarmClockItem;

    move-result-object v8

    new-array v10, v2, [Lcom/angcyo/dsladapter/DslAdapterItem;

    aput-object v8, v10, v9

    invoke-static {v10}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {v6, v8}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setItems(Ljava/util/List;)V

    new-instance v8, Lcom/sma/smartv3/ui/device/item/DeviceListItem;

    invoke-direct {v8}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;-><init>()V

    const v10, 0x7f140406

    invoke-virtual {v8, v10}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setMTitle(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getShockLevelItem()Lcom/sma/smartv3/ui/device/item/ShockLevelItem;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getActivityRecognitionItem()Lcom/sma/smartv3/ui/device/item/ActivityRecognitionItem;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getFindWatchItem()Lcom/sma/smartv3/ui/device/item/FindWatchItem;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getMeasureUnitItem()Lcom/sma/smartv3/ui/device/item/MeasureUnitItem;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getFirmwareItem()Lcom/sma/smartv3/ui/device/item/FirmwareItem;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getResetItem()Lcom/sma/smartv3/ui/device/item/ResetItem;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getShutdownItem()Lcom/sma/smartv3/ui/device/item/ShutdownItem;

    move-result-object v16

    move/from16 v17, v2

    const/4 v2, 0x7

    move/from16 v18, v3

    new-array v3, v2, [Lcom/angcyo/dsladapter/DslAdapterItem;

    aput-object v10, v3, v9

    aput-object v11, v3, v17

    aput-object v12, v3, v18

    aput-object v13, v3, v4

    aput-object v14, v3, v5

    aput-object v15, v3, v7

    const/4 v10, 0x6

    aput-object v16, v3, v10

    invoke-static {v3}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v8, v3}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setItems(Ljava/util/List;)V

    new-instance v3, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;

    invoke-direct {v3}, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getUnpairItem()Lcom/sma/smartv3/ui/device/item/UnpairItem;

    move-result-object v11

    new-instance v12, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;

    invoke-direct {v12}, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;-><init>()V

    new-array v2, v2, [Lcom/angcyo/dsladapter/DslAdapterItem;

    aput-object v0, v2, v9

    aput-object v1, v2, v17

    aput-object v6, v2, v18

    aput-object v8, v2, v4

    aput-object v3, v2, v5

    aput-object v11, v2, v7

    aput-object v12, v2, v10

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->initView()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/Device2Fragment;->addMarginTop:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a09c1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/BarUtils;->addMarginTopEqualStatusBarHeight(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public isM100Items()Ljava/util/List;
    .locals 15
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/angcyo/dsladapter/DslAdapterItem;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/Device2Fragment;->getInfo2Item()Lcom/sma/smartv3/ui/device/item/Info2Item;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/item/DeviceListItem;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;-><init>()V

    const v2, 0x7f140cb1

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setMTitle(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getHrMonitoringItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getBloodOxyGenItem()Lcom/sma/smartv3/ui/device/item/BloodOxyGenItem;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getPressureItem()Lcom/sma/smartv3/ui/device/item/PressureItem;

    move-result-object v4

    const/4 v5, 0x3

    new-array v6, v5, [Lcom/angcyo/dsladapter/DslAdapterItem;

    const/4 v7, 0x0

    aput-object v2, v6, v7

    const/4 v2, 0x1

    aput-object v3, v6, v2

    const/4 v3, 0x2

    aput-object v4, v6, v3

    invoke-static {v6}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setItems(Ljava/util/List;)V

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    new-instance v4, Lcom/sma/smartv3/ui/device/item/DeviceListItem;

    invoke-direct {v4}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;-><init>()V

    const v6, 0x7f140406

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setMTitle(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getGestureWakeItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getGestureWake2Item()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v8

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getBackLightItem()Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;

    move-result-object v9

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getFirmwareItem()Lcom/sma/smartv3/ui/device/item/FirmwareItem;

    move-result-object v10

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getResetItem()Lcom/sma/smartv3/ui/device/item/ResetItem;

    move-result-object v11

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getShutdownItem()Lcom/sma/smartv3/ui/device/item/ShutdownItem;

    move-result-object v12

    const/4 v13, 0x6

    new-array v14, v13, [Lcom/angcyo/dsladapter/DslAdapterItem;

    aput-object v6, v14, v7

    aput-object v8, v14, v2

    aput-object v9, v14, v3

    aput-object v10, v14, v5

    const/4 v6, 0x4

    aput-object v11, v14, v6

    const/4 v8, 0x5

    aput-object v12, v14, v8

    invoke-static {v14}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->setItems(Ljava/util/List;)V

    new-instance v9, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;

    invoke-direct {v9}, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getUnpairItem()Lcom/sma/smartv3/ui/device/item/UnpairItem;

    move-result-object v10

    new-instance v11, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;

    invoke-direct {v11}, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;-><init>()V

    new-array v12, v13, [Lcom/angcyo/dsladapter/DslAdapterItem;

    aput-object v0, v12, v7

    aput-object v1, v12, v2

    aput-object v4, v12, v3

    aput-object v9, v12, v5

    aput-object v10, v12, v6

    aput-object v11, v12, v8

    invoke-static {v12}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d108d

    return v0
.end method

.method public final setAddMarginTop(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/Device2Fragment;->addMarginTop:Z

    return-void
.end method

.method public final showDropDownPopup(Landroid/view/View;)V
    .locals 8
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/Device2Fragment;->mDropDownPopup:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "LOCATION"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    new-instance v4, Lcom/android/mltcode/paycertificationapi/XX10O10;

    invoke-direct {v4, p0, p1}, Lcom/android/mltcode/paycertificationapi/XX10O10;-><init>(Lcom/sma/smartv3/ui/device/Device2Fragment;Landroid/view/View;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/hr1;->XXIIO1i11(Lcom/android/mltcode/paycertificationapi/hr1;Landroid/content/Context;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/hr1;->i11I(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XOOiI1;

    invoke-direct {v2, p0, p1}, Lcom/android/mltcode/paycertificationapi/XOOiI1;-><init>(Lcom/sma/smartv3/ui/device/Device2Fragment;Landroid/view/View;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/hr1;->OX(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_2
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    :try_start_0
    const-string v3, "android.bluetooth.adapter.action.REQUEST_ENABLE"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x5

    const/4 v5, 0x0

    move-object v2, p0

    :try_start_1
    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/X1OOO;->XiOIO(Landroidx/fragment/app/Fragment;Ljava/lang/String;IIILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    :goto_0
    move-object p1, v0

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v2, p0

    goto :goto_0

    :goto_1
    const-string v0, "Please turn on bluetooth"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestEnableBluetooth -> "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_3
    move-object v2, p0

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->X1()Z

    move-result v0

    if-nez v0, :cond_4

    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x6

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v3, 0x7f0d0f38

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v3, 0x7f0a01ee

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;

    invoke-virtual {v3, v1, v1}, Landroid/view/View;->measure(II)V

    invoke-virtual {v3}, Landroid/view/View;->requestLayout()V

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/android/mltcode/paycertificationapi/XXiOOOX;->OXO1(Landroid/content/Context;Landroid/view/View;)Landroid/widget/PopupWindow;

    move-result-object v1

    iput-object v1, v2, Lcom/sma/smartv3/ui/device/Device2Fragment;->mDropDownPopup:Landroid/widget/PopupWindow;

    sget-object v1, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->TOP:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    invoke-virtual {v3, v1}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->O00(Lcom/sma/smartv3/view/bubbleview/ArrowDirection;)Lcom/sma/smartv3/view/bubbleview/BubbleLayout;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v4

    sub-int/2addr v1, v4

    int-to-float v1, v1

    invoke-virtual {v3}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->getArrowWidth()F

    move-result v4

    const/4 v5, 0x2

    int-to-float v5, v5

    div-float/2addr v4, v5

    sub-float/2addr v1, v4

    invoke-virtual {v3, v1}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XOO0ii0(F)Lcom/sma/smartv3/view/bubbleview/BubbleLayout;

    const v1, 0x7f0a071c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v3, Lcom/android/mltcode/paycertificationapi/XXIO11;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/XXIO11;-><init>(Lcom/sma/smartv3/ui/device/Device2Fragment;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0a0720

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XiO00OOX;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XiO00OOX;-><init>(Lcom/sma/smartv3/ui/device/Device2Fragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, v2, Lcom/sma/smartv3/ui/device/Device2Fragment;->mDropDownPopup:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_5

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;)V

    :cond_5
    :goto_2
    return-void
.end method
