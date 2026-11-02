.class public final Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;
.super Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/device/BaseListFunctionActivity<",
        "Lcom/android/mltcode/paycertificationapi/X1Oi0i;",
        ">;",
        "Landroid/widget/CompoundButton$OnCheckedChangeListener;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNotificationSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationSettingsActivity.kt\ncom/sma/smartv3/ui/device/NotificationSettingsActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n55#2,12:354\n84#2,3:366\n1563#3:369\n1634#3,3:370\n1563#3:373\n1634#3,3:374\n774#3:377\n865#3,2:378\n774#3:380\n865#3,2:381\n13805#4,2:383\n1#5:385\n*S KotlinDebug\n*F\n+ 1 NotificationSettingsActivity.kt\ncom/sma/smartv3/ui/device/NotificationSettingsActivity\n*L\n118#1:354,12\n118#1:366,3\n127#1:369\n127#1:370,3\n132#1:373\n132#1:374,3\n155#1:377\n155#1:378,2\n162#1:380\n162#1:381,2\n177#1:383,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNotificationSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationSettingsActivity.kt\ncom/sma/smartv3/ui/device/NotificationSettingsActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n55#2,12:354\n84#2,3:366\n1563#3:369\n1634#3,3:370\n1563#3:373\n1634#3,3:374\n774#3:377\n865#3,2:378\n774#3:380\n865#3,2:381\n13805#4,2:383\n1#5:385\n*S KotlinDebug\n*F\n+ 1 NotificationSettingsActivity.kt\ncom/sma/smartv3/ui/device/NotificationSettingsActivity\n*L\n118#1:354,12\n118#1:366,3\n127#1:369\n127#1:370,3\n132#1:373\n132#1:374,3\n155#1:377\n155#1:378,2\n162#1:380\n162#1:381,2\n177#1:383,2\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final checkCall$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final checkMirrorPhone$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final checkSms$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final defautListView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ll$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCacheDefaultList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/X1Oi0i;",
            ">;"
        }
    .end annotation
.end field

.field private mCacheList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/X1Oi0i;",
            ">;"
        }
    .end annotation
.end field

.field public mCommonAdapter:Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/XII0Oi10O<",
            "Lcom/android/mltcode/paycertificationapi/X1Oi0i;",
            ">;"
        }
    .end annotation
.end field

.field private final mDefaultList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/X1Oi0i;",
            ">;"
        }
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final otherPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final searchEditText$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ab1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ab1;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->ll$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bb1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bb1;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->checkCall$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cb1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/cb1;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->checkSms$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/db1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/db1;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->checkMirrorPhone$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/eb1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/eb1;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->otherPanel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ra1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ra1;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sa1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sa1;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->defautListView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ta1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ta1;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->searchEditText$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mDefaultList:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mCacheDefaultList:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mCacheList:Ljava/util/List;

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->checkCall_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(ZLcom/sma/smartv3/ui/device/NotificationSettingsActivity;Landroid/widget/CompoundButton;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->onCheckedChanged$lambda$1(ZLcom/sma/smartv3/ui/device/NotificationSettingsActivity;Landroid/widget/CompoundButton;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->searchEditText_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->checkSms_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/ListView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->defautListView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/ListView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->textChanged$lambda$2(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V

    return-void
.end method

.method public static synthetic X01IiOiIi(ZLcom/sma/smartv3/ui/device/NotificationSettingsActivity;Landroid/widget/CompoundButton;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->onCheckedChanged$lambda$0(ZLcom/sma/smartv3/ui/device/NotificationSettingsActivity;Landroid/widget/CompoundButton;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->showOthersList$lambda$0$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->initItem$lambda$0$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->otherPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->updateOthers$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;Z)V

    return-void
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->showOthersList$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$textChanged(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;Landroid/text/Editable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->textChanged(Landroid/text/Editable;)V

    return-void
.end method

.method private static final checkCall_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/CheckBox;
    .locals 1

    const v0, 0x7f0a022c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final checkMirrorPhone_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/CheckBox;
    .locals 1

    const v0, 0x7f0a0235

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final checkSms_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/CheckBox;
    .locals 1

    const v0, 0x7f0a023a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final defautListView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/ListView;
    .locals 1

    const v0, 0x7f0a02e1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ListView;

    return-object p0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getCheckCall()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->checkCall$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getCheckMirrorPhone()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->checkMirrorPhone$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getCheckSms()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->checkSms$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getDefautListView()Landroid/widget/ListView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->defautListView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    return-object v0
.end method

.method private final getLl()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->ll$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getOtherPanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->otherPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getSearchEditText()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->searchEditText$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->checkMirrorPhone_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->ll_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final initItem$lambda$0$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;ILandroid/view/View;)V
    .locals 3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->XO0O10()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->O00(Z)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->iO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notification_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->XO0O10()Z

    move-result v1

    invoke-virtual {p2, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method private static final ll_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a06b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final onCheckedChanged$lambda$0(ZLcom/sma/smartv3/ui/device/NotificationSettingsActivity;Landroid/widget/CompoundButton;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p3, v0, :cond_0

    sget-object p2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p2

    const-string p3, "notification_call"

    invoke-virtual {p2, p3, p0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    sget-object p0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/BleInitializer;->IOI()V

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/BleInitializer;->IIX(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->permissionRemind()V

    xor-int/lit8 p0, p0, 0x1

    invoke-virtual {p2, p0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onCheckedChanged$lambda$1(ZLcom/sma/smartv3/ui/device/NotificationSettingsActivity;Landroid/widget/CompoundButton;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p3, v0, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string p2, "notification_sms"

    invoke-virtual {p1, p2, p0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    sget-object p0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/BleInitializer;->O0i()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->permissionRemind()V

    xor-int/lit8 p0, p0, 0x1

    invoke-virtual {p2, p0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final otherPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a08e2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final searchEditText_delegate$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a08a1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private final showDefaultList()V
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->I1()[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v5, v4, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_0

    new-instance v4, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-direct {v4}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->IiI10X(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->XOO0ii0(Ljava/lang/String;)V

    iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->I0IIOi(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mDefaultList:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    sget-object v5, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/i72;->O0Ii()Z

    move-result v5

    if-eqz v5, :cond_1

    sget-object v5, Lcom/android/mltcode/paycertificationapi/la1;->OXO1:Lcom/android/mltcode/paycertificationapi/la1;

    invoke-virtual {v5, v4}, Lcom/android/mltcode/paycertificationapi/la1;->OXO1(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v5

    invoke-virtual {v5}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {v5}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-lez v7, :cond_1

    new-instance v7, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-direct {v7}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;-><init>()V

    invoke-virtual {p0, v6}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v7, v6}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->IiI10X(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v7, v5}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->XOO0ii0(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->I0IIOi(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mDefaultList:Ljava/util/List;

    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mDefaultList:Ljava/util/List;

    new-instance v2, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity$XIi00iiXO;

    invoke-direct {v2, p0, v0, v1}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;Landroid/app/Activity;Ljava/util/List;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getDefautListView()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->setMCommonAdapter(Lcom/android/mltcode/paycertificationapi/XII0Oi10O;)V

    return-void
.end method

.method private final showOthersList()V
    .locals 8

    new-instance v5, Lcom/android/mltcode/paycertificationapi/wa1;

    invoke-direct {v5, p0}, Lcom/android/mltcode/paycertificationapi/wa1;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    return-void
.end method

.method private static final showOthersList$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)Lkotlin/Unit;
    .locals 5

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v1, 0x2000

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v0

    const-string v1, "getInstalledApplications(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ApplicationInfo;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i72;->XX00XX()Z

    move-result v3

    if-nez v3, :cond_1

    iget v3, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v4, v3, 0x80

    if-nez v4, :cond_0

    and-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i72;->I1()[Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/collections/ArraysKt___ArraysKt;->XOOOI0X([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->IiI10X(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->XOO0ii0(Ljava/lang/String;)V

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v1}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->I0IIOi(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/android/mltcode/paycertificationapi/va1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/va1;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showOthersList$lambda$0$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method private final textChanged(Landroid/text/Editable;)V
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mCacheDefaultList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mDefaultList:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mDefaultList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mCacheDefaultList:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mCacheList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mCacheList:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->showLoadingPopup()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mCacheDefaultList:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->XiOOOi0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mDefaultList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mDefaultList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getMCommonAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mCacheList:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->XiOOOi0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/za1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/za1;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mDefaultList:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mDefaultList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {v7}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->XIi00iiXO()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8, v4, v3, v2}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v7

    if-ne v7, v1, :cond_3

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mDefaultList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mDefaultList:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getMCommonAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_5
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {v7}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->XIi00iiXO()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8, v4, v3, v2}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v7

    if-ne v7, v1, :cond_6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_8
    return-void
.end method

.method private static final textChanged$lambda$2(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->disLoadingPopup()V

    return-void
.end method

.method private final updateOthers(Z)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ua1;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/ua1;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final updateOthers$lambda$0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;Z)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getOtherPanel()Landroid/view/View;

    move-result-object p0

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final disLoadingPopup()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method public final getMCacheDefaultList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/X1Oi0i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mCacheDefaultList:Ljava/util/List;

    return-object v0
.end method

.method public final getMCacheList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/X1Oi0i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mCacheList:Ljava/util/List;

    return-object v0
.end method

.method public final getMCommonAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/XII0Oi10O<",
            "Lcom/android/mltcode/paycertificationapi/X1Oi0i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mCommonAdapter:Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mCommonAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMDefaultList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/X1Oi0i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mDefaultList:Ljava/util/List;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/android/mltcode/paycertificationapi/X1Oi0i;I)V
    .locals 4
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/X1Oi0i;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->OXO1()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    const v0, 0x7f0a0638

    invoke-virtual {p1, v0, p2}, Lcom/android/mltcode/paycertificationapi/ug6;->I0iXXO(ILandroid/graphics/drawable/Drawable;)Lcom/android/mltcode/paycertificationapi/ug6;

    .line 3
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->XIi00iiXO()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f0a0cc7

    invoke-virtual {p1, v0, p2}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    .line 4
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    .line 5
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    .line 6
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->iO()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notification_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 8
    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->O00(Z)V

    .line 9
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->XO0O10()Z

    move-result p2

    const v0, 0x7f0a022e

    invoke-virtual {p1, v0, p2}, Lcom/android/mltcode/paycertificationapi/ug6;->IO(IZ)Lcom/android/mltcode/paycertificationapi/ug6;

    .line 10
    new-instance p2, Lcom/android/mltcode/paycertificationapi/qa1;

    invoke-direct {p2, p0, p3}, Lcom/android/mltcode/paycertificationapi/qa1;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;I)V

    invoke-static {p1, v0, p2}, Lcom/android/mltcode/paycertificationapi/vg6;->OXO1(Lcom/android/mltcode/paycertificationapi/ug6;ILandroid/view/View$OnClickListener;)Lcom/android/mltcode/paycertificationapi/ug6;

    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/android/mltcode/paycertificationapi/X1Oi0i;I)V

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
            "Lcom/android/mltcode/paycertificationapi/X1Oi0i;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public initView()V
    .locals 8

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140f3f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f081563

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OI()Z

    move-result v0

    const/4 v2, 0x1

    const-string v3, "notification_call"

    const/16 v4, 0x8

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getLl()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, v3, v1}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getCheckCall()Landroid/widget/CheckBox;

    move-result-object v3

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/gb1;->OXO1()[Ljava/lang/String;

    move-result-object v0

    array-length v5, v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getLl()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, v3, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {v0}, Lcom/sma/smartv3/initializer/BleInitializer;->IOI()V

    :goto_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->Xi1i0XOX0()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getLl()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v5

    const-string v6, "notification_sms"

    invoke-virtual {v5, v6, v1}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getCheckSms()Landroid/widget/CheckBox;

    move-result-object v6

    if-eqz v5, :cond_3

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/gb1;->XIi00iiXO()[Ljava/lang/String;

    move-result-object v5

    array-length v7, v5

    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ljava/lang/String;

    invoke-static {v5}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    move v2, v1

    :goto_2
    invoke-virtual {v6, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v3, "notification_mirror_phone"

    invoke-virtual {v2, v3, v1}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getCheckMirrorPhone()Landroid/widget/CheckBox;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->updateOthers(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getCheckCall()Landroid/widget/CheckBox;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getCheckSms()Landroid/widget/CheckBox;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getCheckMirrorPhone()Landroid/widget/CheckBox;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v1

    const v2, 0x7f0a035b

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/AdapterView;->setEmptyView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->showDefaultList()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->showOthersList()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getSearchEditText()Landroid/widget/EditText;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f06078f

    invoke-static {v2, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_4
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->XOOI0O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getSearchEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_5
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getSearchEditText()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "<get-searchEditText>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d0efa

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00d5

    return v0
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 9
    .param p1    # Landroid/widget/CompoundButton;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "buttonView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0a022c

    const-string v2, "permission(...)"

    if-eq v0, v1, :cond_3

    const v1, 0x7f0a0235

    if-eq v0, v1, :cond_2

    const v1, 0x7f0a023a

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    const-string v0, "SMS"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lcom/android/mltcode/paycertificationapi/ya1;

    invoke-direct {v6, p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/ya1;-><init>(ZLcom/sma/smartv3/ui/device/NotificationSettingsActivity;Landroid/widget/CompoundButton;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void

    :cond_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "notification_sms"

    invoke-virtual {p1, v0, p2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    return-void

    :cond_2
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "notification_mirror_phone"

    invoke-virtual {p1, v0, p2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-direct {p0, p2}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->updateOthers(Z)V

    return-void

    :cond_3
    if-eqz p2, :cond_4

    const-string v0, "PHONE"

    const-string v1, "CONTACTS"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lcom/android/mltcode/paycertificationapi/xa1;

    invoke-direct {v6, p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/xa1;-><init>(ZLcom/sma/smartv3/ui/device/NotificationSettingsActivity;Landroid/widget/CompoundButton;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void

    :cond_4
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "notification_call"

    invoke-virtual {p1, v0, p2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    sget-object p1, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {p1}, Lcom/sma/smartv3/initializer/BleInitializer;->IOI()V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->disLoadingPopup()V

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

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i72;->IOIX1OI0(Landroid/app/Activity;)V

    return-void
.end method

.method public final setMCacheDefaultList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/X1Oi0i;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mCacheDefaultList:Ljava/util/List;

    return-void
.end method

.method public final setMCacheList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/X1Oi0i;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mCacheList:Ljava/util/List;

    return-void
.end method

.method public final setMCommonAdapter(Lcom/android/mltcode/paycertificationapi/XII0Oi10O;)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/XII0Oi10O<",
            "Lcom/android/mltcode/paycertificationapi/X1Oi0i;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mCommonAdapter:Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    return-void
.end method

.method public final showLoadingPopup()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method
