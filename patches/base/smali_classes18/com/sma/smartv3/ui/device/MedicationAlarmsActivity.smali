.class public final Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;
.super Lcom/bestmafen/androidbase/list/BaseListActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/list/BaseListActivity<",
        "Lcom/szabh/smable3/entity/BleMedicationAlarm;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMedicationAlarmsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedicationAlarmsActivity.kt\ncom/sma/smartv3/ui/device/MedicationAlarmsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,260:1\n1869#2,2:261\n173#3,7:263\n180#3,3:271\n143#3,7:274\n183#3:281\n173#3,7:282\n180#3,3:290\n143#3,7:293\n183#3:300\n1#4:270\n1#4:289\n*S KotlinDebug\n*F\n+ 1 MedicationAlarmsActivity.kt\ncom/sma/smartv3/ui/device/MedicationAlarmsActivity\n*L\n155#1:261,2\n227#1:263,7\n227#1:271,3\n227#1:274,7\n227#1:281\n124#1:282,7\n124#1:290,3\n124#1:293,7\n124#1:300\n227#1:270\n124#1:289\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMedicationAlarmsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedicationAlarmsActivity.kt\ncom/sma/smartv3/ui/device/MedicationAlarmsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,260:1\n1869#2,2:261\n173#3,7:263\n180#3,3:271\n143#3,7:274\n183#3:281\n173#3,7:282\n180#3,3:290\n143#3,7:293\n183#3:300\n1#4:270\n1#4:289\n*S KotlinDebug\n*F\n+ 1 MedicationAlarmsActivity.kt\ncom/sma/smartv3/ui/device/MedicationAlarmsActivity\n*L\n155#1:261,2\n227#1:263,7\n227#1:271,3\n227#1:274,7\n227#1:281\n124#1:282,7\n124#1:290,3\n124#1:293,7\n124#1:300\n227#1:270\n124#1:289\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private final btnBottom$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->Companion:Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wl0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wl0;-><init>(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->tvTip$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xl0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xl0;-><init>(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->btnBottom$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$iO;-><init>(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$iO;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->initView$lambda$0$1$0(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;IZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->initItem$lambda$1$0$0(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;IZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;ILandroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->initItem$lambda$1$0(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;ILandroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;ILcom/android/mltcode/paycertificationapi/fi5;I)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->initView$lambda$0$1(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;ILcom/android/mltcode/paycertificationapi/fi5;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->tvTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;Lcom/android/mltcode/paycertificationapi/fi5;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->initView$lambda$0$0(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;Lcom/android/mltcode/paycertificationapi/fi5;)V

    return-void
.end method

.method public static final synthetic access$checkAlarmCount(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->checkAlarmCount()V

    return-void
.end method

.method public static final synthetic access$getMList(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMListAdapter(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p0

    return-object p0
.end method

.method private static final btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final checkAlarmCount()V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iOI()I

    move-result v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const v4, 0x7f140f2b

    invoke-virtual {p0, v4, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->getBtnBottom()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v3, v0, :cond_1

    const/4 v2, 0x1

    :cond_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method private final checkAlarmList(Ljava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMedicationAlarm;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMedicationAlarm;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->ii0I0()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/szabh/smable3/entity/BleMedicationAlarm;

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMRepeat()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMEnabled()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    sget-object v1, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->Companion:Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$OXO1;

    invoke-virtual {v1, v5}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$OXO1;->XIi00iiXO(Lcom/szabh/smable3/entity/BleMedicationAlarm;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v5, v1}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->setMEnabled(I)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->MEDICATION_ALARM:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method private final getAlarmList()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMedicationAlarm;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v1, Lcom/szabh/smable3/BleKey;->MEDICATION_ALARM:Lcom/szabh/smable3/BleKey;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-class v2, Lcom/szabh/smable3/entity/BleMedicationAlarm;

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/szabh/smable3/component/BaseBleCache;->getList$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->checkAlarmList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    sget-object v4, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/q62;->iOI()I

    move-result v5

    if-gt v3, v5, :cond_0

    return-object v2

    :cond_0
    const/4 v3, 0x0

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/q62;->iOI()I

    move-result v4

    invoke-interface {v2, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/szabh/smable3/component/BaseBleCache;->putList$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/util/List;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    return-object v2
.end method

.method private final getBtnBottom()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->btnBottom$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTvTip()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->tvTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final initItem$lambda$1$0(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;ILandroid/widget/CompoundButton;Z)V
    .locals 1

    const-string v0, "buttonView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vl0;

    invoke-direct {v0, p1, p2, p4}, Lcom/android/mltcode/paycertificationapi/vl0;-><init>(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;IZ)V

    const/4 p1, 0x0

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->OXO1(ZLkotlin/jvm/functions/Function1;)Z

    move-result p1

    if-nez p1, :cond_0

    xor-int/lit8 p1, p4, 0x1

    invoke-virtual {p3, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const p1, 0x7f0a05ca

    invoke-virtual {p0, p1}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object p0

    xor-int/lit8 p1, p4, 0x1

    invoke-virtual {p0, p1}, Landroid/view/View;->setSelected(Z)V

    :cond_0
    return-void
.end method

.method private static final initItem$lambda$1$0$0(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;IZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleMedicationAlarm;

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->setMEnabled(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleMedicationAlarm;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMRepeat()I

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    sget-object p2, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->Companion:Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$OXO1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleMedicationAlarm;

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$OXO1;->OXO1(Lcom/szabh/smable3/entity/BleMedicationAlarm;)Z

    :cond_0
    sget-object v2, Lcom/szabh/smable3/BleKey;->MEDICATION_ALARM:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/bestmafen/baseble/data/BleBuffer;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p3

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;Lcom/android/mltcode/paycertificationapi/fi5;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ji5;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ji5;-><init>(Landroid/content/Context;)V

    const/high16 p0, 0x42780000    # 62.0f

    invoke-static {p0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/ji5;->I1XOi1(I)V

    const p0, 0x7f080ffe

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/ji5;->IO(I)V

    const p0, 0x7f060737

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/ji5;->I0IIOi(I)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/fi5;->OXO1(Lcom/android/mltcode/paycertificationapi/ji5;)V

    return-void
.end method

.method private static final initView$lambda$0$1(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;ILcom/android/mltcode/paycertificationapi/fi5;I)Z
    .locals 0

    new-instance p2, Lcom/android/mltcode/paycertificationapi/ul0;

    invoke-direct {p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/ul0;-><init>(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;I)V

    const/4 p0, 0x0

    invoke-static {p0, p2}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->OXO1(ZLkotlin/jvm/functions/Function1;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final initView$lambda$0$1$0(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->MEDICATION_ALARM:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->DELETE:Lcom/szabh/smable3/BleKeyFlag;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/szabh/smable3/entity/BleMedicationAlarm;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result v4

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->checkAlarmCount()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/szabh/smable3/entity/BleMedicationAlarm;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMEnabled()I

    move-result p1

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string p2, "mArg0"

    const/4 p4, 0x0

    invoke-virtual {p1, p2, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "mArg1"

    invoke-virtual {p1, p2, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p2, "mArg2"

    invoke-virtual {p1, p2, p4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p2, "mArg3"

    invoke-virtual {p1, p2, p4}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p2, Landroid/content/Intent;

    const-class p3, Lcom/sma/smartv3/ui/device/MedicationAlarmEditActivity;

    invoke-direct {p2, p0, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p2, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method

.method private static final tvTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a188f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/szabh/smable3/entity/BleMedicationAlarm;I)V
    .locals 8
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/entity/BleMedicationAlarm;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMEnabled()I

    move-result v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v0

    const v1, 0x7f0a0bb6

    .line 3
    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sma/smartv3/view/TimeView;

    .line 4
    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMYear()I

    move-result v3

    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMMonth()I

    move-result v4

    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMDay()I

    move-result v5

    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMHour()I

    move-result v6

    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMMinute()I

    move-result v7

    invoke-virtual/range {v2 .. v7}, Lcom/sma/smartv3/view/TimeView;->iO(IIIII)V

    .line 5
    invoke-virtual {v2, v0}, Lcom/sma/smartv3/view/TimeView;->setEnabled(Z)V

    const v1, 0x7f0a022e

    .line 6
    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    .line 7
    invoke-virtual {v2, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 8
    new-instance v3, Lcom/android/mltcode/paycertificationapi/yl0;

    invoke-direct {v3, p1, p0, p3}, Lcom/android/mltcode/paycertificationapi/yl0;-><init>(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;I)V

    invoke-virtual {v2, v3}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const p3, 0x7f0a05ca

    .line 9
    invoke-virtual {p1, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    invoke-virtual {p3, v1}, Landroid/view/View;->setSelected(Z)V

    const p3, 0x7f0a0cf9

    .line 10
    invoke-virtual {p1, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 11
    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleMedicationAlarm;->getMRepeat()I

    move-result p2

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/cp5;->X11I(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/szabh/smable3/entity/BleMedicationAlarm;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/szabh/smable3/entity/BleMedicationAlarm;I)V

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMedicationAlarm;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->getAlarmList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 10

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140f2a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    const v1, 0x7f0a035b

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setEmptyView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.baoyz.swipemenulistview.SwipeMenuListView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/baoyz/swipemenulistview/SwipeMenuListView;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/zl0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/zl0;-><init>(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;)V

    invoke-virtual {v0, v1}, Lcom/baoyz/swipemenulistview/SwipeMenuListView;->setMenuCreator(Lcom/android/mltcode/paycertificationapi/hi5;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/am0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/am0;-><init>(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;)V

    invoke-virtual {v0, v1}, Lcom/baoyz/swipemenulistview/SwipeMenuListView;->setOnMenuItemClickListener(Lcom/baoyz/swipemenulistview/SwipeMenuListView$XIi00iiXO;)V

    new-instance v1, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$XIi00iiXO;

    invoke-direct {v1, v0}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$XIi00iiXO;-><init>(Lcom/baoyz/swipemenulistview/SwipeMenuListView;)V

    invoke-virtual {v0, v1}, Lcom/baoyz/swipemenulistview/SwipeMenuListView;->setOnSwipeListener(Lcom/baoyz/swipemenulistview/SwipeMenuListView$XO0O10;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/bm0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/bm0;-><init>(Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$iO;

    invoke-virtual {v2, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->ii0I0()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v3, Lcom/szabh/smable3/BleKey;->MEDICATION_ALARM:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/16 v5, 0xff

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d0ebd

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00ca

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->getAlarmList()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v2, -0x1

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/device/MedicationAlarmEditActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity$iO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MedicationAlarmsActivity;->checkAlarmCount()V

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
