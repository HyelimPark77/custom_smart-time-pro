.class public final Lcom/sma/smartv3/ui/main/NationServerSelectActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNationServerSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 6 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,581:1\n39#2,3:582\n42#2:588\n44#2,2:590\n39#2,3:593\n42#2:599\n44#2,2:601\n1563#3:585\n1634#3,2:586\n1636#3:589\n1563#3:596\n1634#3,2:597\n1636#3:600\n1869#3,2:603\n1878#3,3:605\n1869#3,2:608\n1869#3,2:625\n774#3:627\n865#3,2:628\n1#4:592\n1#4:633\n55#5,12:610\n84#5,3:622\n69#6,3:630\n72#6,5:634\n*S KotlinDebug\n*F\n+ 1 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity\n*L\n123#1:582,3\n123#1:588\n123#1:590,2\n124#1:593,3\n124#1:599\n124#1:601,2\n123#1:585\n123#1:586,2\n123#1:589\n124#1:596\n124#1:597,2\n124#1:600\n147#1:603,2\n246#1:605,3\n291#1:608,2\n555#1:625,2\n564#1:627\n564#1:628,2\n536#1:633\n388#1:610,12\n388#1:622,3\n536#1:630,3\n536#1:634,5\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNationServerSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 6 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,581:1\n39#2,3:582\n42#2:588\n44#2,2:590\n39#2,3:593\n42#2:599\n44#2,2:601\n1563#3:585\n1634#3,2:586\n1636#3:589\n1563#3:596\n1634#3,2:597\n1636#3:600\n1869#3,2:603\n1878#3,3:605\n1869#3,2:608\n1869#3,2:625\n774#3:627\n865#3,2:628\n1#4:592\n1#4:633\n55#5,12:610\n84#5,3:622\n69#6,3:630\n72#6,5:634\n*S KotlinDebug\n*F\n+ 1 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity\n*L\n123#1:582,3\n123#1:588\n123#1:590,2\n124#1:593,3\n124#1:599\n124#1:601,2\n123#1:585\n123#1:586,2\n123#1:589\n124#1:596\n124#1:597,2\n124#1:600\n147#1:603,2\n246#1:605,3\n291#1:608,2\n555#1:625,2\n564#1:627\n564#1:628,2\n536#1:633\n388#1:610,12\n388#1:622,3\n536#1:630,3\n536#1:634,5\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private curSelectedItem:Lcom/android/mltcode/paycertificationapi/d11;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private isGetLocationCode:Z

.field private mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "Lcom/android/mltcode/paycertificationapi/d11;",
            ">;"
        }
    .end annotation
.end field

.field private final mChooseNationText$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mContinentsList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/iiXIXiX;",
            ">;"
        }
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mLocationClient:Lcom/android/mltcode/paycertificationapi/ms;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mLocationServerPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mNationList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/d11;",
            ">;"
        }
    .end annotation
.end field

.field private final mNationSearchIcon$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mNationSearchText$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mNextStep$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSelectNation$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTestServerRemindPop:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final originalNationList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/d11;",
            ">;"
        }
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final selectServerButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final selectServerIsShow$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const-string v0, "NationServerSelectActivity"

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/p11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/p11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/q11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/q11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->selectServerButton$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/r11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/r11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->selectServerIsShow$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/s11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/s11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mSelectNation$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/t11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/t11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mChooseNationText$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/u11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/u11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationSearchText$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/v11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/v11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationSearchIcon$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/w11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/w11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/g11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/g11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNextStep$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->originalNationList:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationList:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mContinentsList:Ljava/util/List;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationSearchIcon_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->selectServerIsShow_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->onSetListener$lambda$3(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->moreSetting$lambda$0$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationSearchText_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->gotoStartLocation$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mChooseNationText_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mSelectNation_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->onSetListener$lambda$2(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->onSetListener$lambda$4(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNextStep_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->onSetListener$lambda$1(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->selectServerButton_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$dismissLoading(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->dismissLoading()V

    return-void
.end method

.method public static final synthetic access$getCurSelectedItem$p(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Lcom/android/mltcode/paycertificationapi/d11;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->curSelectedItem:Lcom/android/mltcode/paycertificationapi/d11;

    return-object p0
.end method

.method public static final synthetic access$getMContext(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getOriginalNationList$p(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->originalNationList:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$notifyDataSetChanged(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->notifyDataSetChanged()V

    return-void
.end method

.method public static final synthetic access$searchContent(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->searchContent(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$setDataNationList(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->setDataNationList(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$stopLocationClient(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->stopLocationClient()V

    return-void
.end method

.method public static final synthetic access$upDataNationList(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Lcom/android/mltcode/paycertificationapi/d11;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->upDataNationList(Lcom/android/mltcode/paycertificationapi/d11;)V

    return-void
.end method

.method private final changeViewStatus()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/android/mltcode/paycertificationapi/d11;

    if-nez v2, :cond_1

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/d11;->IO()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getMNextStep()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method private final dismissLoading()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private final getMChooseNationText()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mChooseNationText$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMNationSearchIcon()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationSearchIcon$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMNationSearchText()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationSearchText$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getMNextStep()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNextStep$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getMSelectNation()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mSelectNation$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getNetworkNationData()V
    .locals 2

    const-string v0, "https://api-oss.iot-solution.net/var-www/countrys/countries.min.json"

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->get(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$getNetworkNationData$1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$getNetworkNationData$1;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsJSONObject(Lcom/androidnetworking/interfaces/JSONObjectRequestListener;)V

    return-void
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getSelectServerButton()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->selectServerButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getSelectServerIsShow()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->selectServerIsShow$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final gotoStartLocation()V
    .locals 7

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->X1()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->locationServerRemind()V

    return-void

    :cond_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    new-instance v4, Lcom/android/mltcode/paycertificationapi/f11;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/f11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/hr1;->XXIIO1i11(Lcom/android/mltcode/paycertificationapi/hr1;Landroid/content/Context;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method private static final gotoStartLocation$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->startLocationClient()V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "No location permissions"

    invoke-static {p1, p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->locationServerRemind$lambda$0$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Z

    move-result p0

    return p0
.end method

.method private final locationServerRemind()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mLocationServerPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f140e2e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/m11;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/m11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    const v2, 0x7f14122c

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mLocationServerPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mLocationServerPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method private static final locationServerRemind$lambda$0$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Z
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final mChooseNationText_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0242

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mNationSearchIcon_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0869

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mNationSearchText_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a086a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final mNextStep_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01da

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a09c1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final mSelectNation_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09fb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final moreSetting$lambda$0$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Z
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/DeveloperServerActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    const/4 p0, 0x1

    return p0
.end method

.method private final notifyDataSetChanged()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->changeViewStatus()V

    return-void
.end method

.method private final onSetListener()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getMNationSearchText()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "<get-mNationSearchText>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getMNationSearchIcon()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/h11;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/h11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getSelectServerButton()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getSelectServerIsShow()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/j11;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/j11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getMNextStep()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/k11;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/k11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getMSelectNation()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/l11;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/l11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final onSetListener$lambda$1(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getMNationSearchText()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->searchContent(Ljava/lang/String;)V

    return-void
.end method

.method private static final onSetListener$lambda$2(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Landroid/view/View;)Z
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getSelectServerButton()Landroid/view/View;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final onSetListener$lambda$3(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->curSelectedItem:Lcom/android/mltcode/paycertificationapi/d11;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/d11;->I0IIOi()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->routeByCountry(Ljava/lang/String;)V

    return-void

    :cond_0
    const p1, 0x7f1403bb

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private static final onSetListener$lambda$4(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->gotoStartLocation()V

    return-void
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final routeByCountry(Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " routeByCountry ct = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x82c

    if-eq v0, v1, :cond_6

    const/16 v1, 0x82f

    if-eq v0, v1, :cond_4

    const/16 v1, 0x86b

    if-eq v0, v1, :cond_2

    const/16 v1, 0x8b0

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "EU"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->onEuroAmerica()V

    return-void

    :cond_2
    const-string v0, "CN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->onChinaMainland()V

    return-void

    :cond_4
    const-string v0, "AP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->onAsiaPacific()V

    return-void

    :cond_6
    const-string v0, "AM"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->onAsiaPacific()V

    return-void

    :cond_7
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->onSiliconValleyServerLl()V

    return-void
.end method

.method private final searchContent(Ljava/lang/String;)V
    .locals 5

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->originalNationList:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/d11;

    iget-object v2, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->curSelectedItem:Lcom/android/mltcode/paycertificationapi/d11;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/d11;->XOO0ii0()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/d11;->XOO0ii0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lcom/android/mltcode/paycertificationapi/oe5;->OX0X1O10X(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/d11;->OIX0iXi(Z)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationList:Ljava/util/List;

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->originalNationList:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->originalNationList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/android/mltcode/paycertificationapi/d11;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/d11;->OIi0()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1, v1}, Lkotlin/text/StringsKt__StringsKt;->iOiXX(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationList:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :goto_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->notifyDataSetChanged()V

    return-void
.end method

.method private static final selectServerButton_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0a1d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final selectServerIsShow_delegate$lambda$0(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0a1e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final setDataNationList(Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v6, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_0
    check-cast v4, Lcom/android/mltcode/paycertificationapi/d11;

    invoke-virtual {v4, v1}, Lcom/android/mltcode/paycertificationapi/d11;->OIX0iXi(Z)V

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/d11;->XOO0ii0()Ljava/lang/String;

    move-result-object v7

    invoke-static {p1, v7, v5}, Lcom/android/mltcode/paycertificationapi/oe5;->OX0X1O10X(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v4, v5}, Lcom/android/mltcode/paycertificationapi/d11;->OIX0iXi(Z)V

    iput-object v4, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->curSelectedItem:Lcom/android/mltcode/paycertificationapi/d11;

    move v3, v2

    :cond_1
    move v2, v6

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->curSelectedItem:Lcom/android/mltcode/paycertificationapi/d11;

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getMChooseNationText()Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->curSelectedItem:Lcom/android/mltcode/paycertificationapi/d11;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/d11;->XOO0ii0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/e11;->iO(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->notifyDataSetChanged()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p1

    instance-of v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v0, :cond_4

    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result p1

    goto :goto_2

    :cond_5
    move p1, v1

    :goto_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->originalNationList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x5

    if-ge v3, v0, :cond_7

    if-le p1, v3, :cond_6

    add-int/lit8 v3, v3, -0x4

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    goto :goto_3

    :cond_6
    if-ge p1, v3, :cond_7

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->originalNationList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p1, v5

    add-int/lit8 v3, v3, 0x4

    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    :cond_7
    :goto_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    return-void
.end method

.method private final setRecyclerView()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationList:Ljava/util/List;

    new-instance v1, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$setRecyclerView$1;

    invoke-direct {v1, p0, v0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$setRecyclerView$1;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Ljava/util/List;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private final showLoading(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/uq;->iOOX010X(Ljava/lang/String;)V

    :cond_0
    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method public static synthetic showLoading$default(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, ""

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->showLoading(Ljava/lang/String;)V

    return-void
.end method

.method private final startLocationClient()V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->showLoading$default(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mLocationClient:Lcom/android/mltcode/paycertificationapi/ms;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    new-instance v0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    const/4 v3, 0x2

    invoke-static {v0, v2, v3, v1}, Lcom/android/mltcode/paycertificationapi/ns;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/IO0OI;ZILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ms;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mLocationClient:Lcom/android/mltcode/paycertificationapi/ms;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mLocationClient:Lcom/android/mltcode/paycertificationapi/ms;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v2, v2}, Lcom/android/mltcode/paycertificationapi/ms;->IiI10X(IZ)V

    :cond_1
    return-void
.end method

.method private final stopLocationClient()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mLocationClient:Lcom/android/mltcode/paycertificationapi/ms;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ms;->I0IIOi()V

    :cond_0
    return-void
.end method

.method private final toStartLogin()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "IS_SELECT_LOGIN"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/i72;->XOiXXOO(Landroid/app/Activity;)V

    return-void
.end method

.method private final upDataNationList(Lcom/android/mltcode/paycertificationapi/d11;)V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/d11;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/d11;->OIX0iXi(Z)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/d11;->XOO0ii0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/d11;->XOO0ii0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iput-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->curSelectedItem:Lcom/android/mltcode/paycertificationapi/d11;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/d11;->OIX0iXi(Z)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method public final getMAdapter()Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "Lcom/android/mltcode/paycertificationapi/d11;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    return-object v0
.end method

.method public final getMContinentsList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/iiXIXiX;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mContinentsList:Ljava/util/List;

    return-object v0
.end method

.method public final getMNationList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/d11;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationList:Ljava/util/List;

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

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 8

    const-class v0, Lcom/android/mltcode/paycertificationapi/d11;

    const-string v1, "_list"

    const-class v2, Lcom/android/mltcode/paycertificationapi/iiXIXiX;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->setBarView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getMNextStep()Landroid/widget/Button;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/View;->setEnabled(Z)V

    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    const/16 v4, 0xa

    :try_start_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/gson/JsonElement;

    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v7, v6, v2}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v5

    :cond_0
    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/e11;->XO0O10()Ljava/util/List;

    move-result-object v5

    :cond_1
    check-cast v5, Ljava/util/Collection;

    invoke-static {v5}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mContinentsList:Ljava/util/List;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v3, v0}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v2

    :cond_2
    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/e11;->O00()Ljava/util/List;

    move-result-object v2

    :cond_3
    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationList:Ljava/util/List;

    iget-object v1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->originalNationList:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->setRecyclerView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getNetworkNationData()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->onSetListener()V

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->X1()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/hr1;->X00Xi1X(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->gotoStartLocation()V

    :cond_4
    return-void
.end method

.method public final isGetLocationCode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->isGetLocationCode:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00d1

    return v0
.end method

.method public final moreSetting(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mTestServerRemindPop:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f141323

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const v0, 0x800003

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->IXXOO(Ljava/lang/Integer;)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/n11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/n11;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    const v1, 0x7f141079

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mTestServerRemindPop:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mTestServerRemindPop:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final onAsiaPacific()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "API_BASE_URL"

    const-string v3, "https://api.iot-solution.net/kotlinweb"

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const v1, 0x7f140169

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SERVER_NAME"

    invoke-virtual {v0, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->toStartLogin()V

    return-void
.end method

.method public final onChinaMainland()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "API_BASE_URL"

    const-string v3, "https://api-c.iot-solution.net/kotlinweb"

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const v1, 0x7f1402be

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SERVER_NAME"

    invoke-virtual {v0, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->toStartLogin()V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->dismissLoading()V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public final onEmailLoginDone(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "ALREADY_LOGIN"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public final onEuroAmerica()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "API_BASE_URL"

    const-string v3, "https://api-eg.iot-solution.net/kotlinweb"

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const v1, 0x7f140b53

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SERVER_NAME"

    invoke-virtual {v0, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->toStartLogin()V

    return-void
.end method

.method public final onSiliconValleyServerLl()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "API_BASE_URL"

    const-string v3, "https://api-usa.iot-solution.net/kotlinweb"

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const v1, 0x7f141251

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SERVER_NAME"

    invoke-virtual {v0, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->toStartLogin()V

    return-void
.end method

.method public final setBarView()V
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->transparentStatusBar()V

    return-void
.end method

.method public final setGetLocationCode(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->isGetLocationCode:Z

    return-void
.end method

.method public final setMAdapter(Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;)V
    .locals 0
    .param p1    # Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "Lcom/android/mltcode/paycertificationapi/d11;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    return-void
.end method

.method public final setMContinentsList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/iiXIXiX;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mContinentsList:Ljava/util/List;

    return-void
.end method

.method public final setMNationList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/d11;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->mNationList:Ljava/util/List;

    return-void
.end method
