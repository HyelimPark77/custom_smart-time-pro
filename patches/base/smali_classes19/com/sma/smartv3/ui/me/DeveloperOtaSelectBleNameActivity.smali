.class public final Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;
.super Lcom/bestmafen/androidbase/list/BaseListActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/list/BaseListActivity<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperOtaSelectBleNameActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,193:1\n1563#2:194\n1634#2,3:195\n176#3,11:198\n196#3:217\n252#4,7:209\n270#4:216\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity\n*L\n52#1:194\n52#1:195,3\n174#1:198,11\n174#1:217\n174#1:209,7\n174#1:216\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperOtaSelectBleNameActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,193:1\n1563#2:194\n1634#2,3:195\n176#3,11:198\n196#3:217\n252#4,7:209\n270#4:216\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity\n*L\n52#1:194\n52#1:195,3\n174#1:198,11\n174#1:217\n174#1:209,7\n174#1:216\n*E\n"
    }
.end annotation


# instance fields
.field private final btNext$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private dataList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mRecyclerAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final recyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final searchList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final searchView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final select_group_ll$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final toolbar$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvSelect$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvSelectRemind$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiO1Xi0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiO1Xi0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->tvSelectRemind$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0OOO0OO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0OOO0OO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->tvSelect$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O00XXII10;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O00XXII10;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->btNext$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IX0XOXOOI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IX0XOXOOI;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->toolbar$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1OOI0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1OOI0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->searchView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXOiI0XX0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXOiI0XX0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->recyclerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iO101I0X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iO101I0X;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->select_group_ll$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->searchList:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->dataList:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Lcom/l4digital/fastscroll/FastScrollRecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->recyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->tvSelect_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->initItem$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroidx/appcompat/widget/Toolbar;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->toolbar_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroidx/appcompat/widget/Toolbar;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->btNext_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Lcom/miguelcatalan/materialsearchview/MaterialSearchView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->searchView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->tvSelectRemind_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->select_group_ll_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDataList$p(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->dataList:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$getMRecyclerAdapter$p(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->mRecyclerAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    return-object p0
.end method

.method public static final synthetic access$getRecyclerView(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Lcom/l4digital/fastscroll/FastScrollRecyclerView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->getRecyclerView()Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getSearchList$p(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->searchList:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$getSelect_group_ll(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->getSelect_group_ll()Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvSelect(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->getTvSelect()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final btNext_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    const v0, 0x7f0a01a0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    return-object p0
.end method

.method private final getBtNext()Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->btNext$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    return-object v0
.end method

.method private final getRecyclerView()Lcom/l4digital/fastscroll/FastScrollRecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->recyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    return-object v0
.end method

.method private final getSearchView()Lcom/miguelcatalan/materialsearchview/MaterialSearchView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->searchView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    return-object v0
.end method

.method private final getSelect_group_ll()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->select_group_ll$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getToolbar()Landroidx/appcompat/widget/Toolbar;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->toolbar$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    return-object v0
.end method

.method private final getTvSelect()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->tvSelect$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvSelectRemind()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->tvSelectRemind$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final initItem$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->getTvSelect()Landroid/widget/TextView;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final recyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Lcom/l4digital/fastscroll/FastScrollRecyclerView;
    .locals 1

    const v0, 0x7f0a0995

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    return-object p0
.end method

.method private static final searchView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Lcom/miguelcatalan/materialsearchview/MaterialSearchView;
    .locals 1

    const v0, 0x7f0a0a01

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    return-object p0
.end method

.method private static final select_group_ll_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a0a16

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private final setSearchIconColor(Landroid/view/MenuItem;Ljava/lang/Integer;)V
    .locals 2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/core/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v1, p2}, Landroidx/core/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    :cond_0
    return-void
.end method

.method private static final toolbar_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroidx/appcompat/widget/Toolbar;
    .locals 1

    const v0, 0x7f0a0bc3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/Toolbar;

    return-object p0
.end method

.method private static final tvSelectRemind_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d0a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvSelect_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d09

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OXI0Xi()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/DeviceOnlineInfo;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/DeviceOnlineInfo;->getBleName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0iIXiI()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->dataList:Ljava/util/ArrayList;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->XIi(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0iIXiI()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->dataList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onlines:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", local:"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", merge\uff1a"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/String;I)V

    return-void
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/String;I)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x1020014

    .line 2
    invoke-virtual {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    .line 3
    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXIOXXi;

    invoke-direct {v0, p0, p2}, Lcom/android/mltcode/paycertificationapi/IXIOXXi;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;Ljava/lang/String;)V

    invoke-virtual {p1, p3, v0}, Lcom/android/mltcode/paycertificationapi/ug6;->O10IXXX0X(ILandroid/view/View$OnClickListener;)Lcom/android/mltcode/paycertificationapi/ug6;

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
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->getTvSelectRemind()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f14121d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->getToolbar()Landroidx/appcompat/widget/Toolbar;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->searchList:Ljava/util/ArrayList;

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$1;

    invoke-direct {v1, p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;Ljava/util/ArrayList;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->getRecyclerView()Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->mRecyclerAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->getRecyclerView()Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->getSearchView()Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;->X01IiOiIi(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->getSearchView()Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)V

    invoke-virtual {v0, v1}, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;->setOnQueryTextListener(Lcom/miguelcatalan/materialsearchview/MaterialSearchView$I0IIOi;)V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x1090003

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0073

    return v0
.end method

.method public final nextOnClick(Landroid/view/View;)V
    .locals 8
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const/4 v0, 0x0

    const-string v1, "view"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->getTvSelect()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    const p1, 0x7f141216

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->getBtNext()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    new-array p1, v0, [Ljava/lang/Object;

    const-string v1, "Network request, please wait"

    invoke-static {v1, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->getTvSelect()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/sma/smartv3/network/RequestBodyKt;->getBleFirmwareAllListBody(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$nextOnClick$1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$nextOnClick$1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)V

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v4

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/ble_firmware/list_no_verify"

    invoke-virtual {p1, v5, v6}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7, v1}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object p1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v5, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$nextOnClick$$inlined$post$default$1;

    invoke-direct {v5, v3, v2, v4}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$nextOnClick$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {p1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Lcom/sma/smartv3/model/BleFirmwareVersionInfoList;

    aput-object v2, v1, v0

    const-class v0, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v0, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$nextOnClick$$inlined$post$default$2;

    invoke-direct {v1, v5}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$nextOnClick$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .param p1    # Landroid/view/Menu;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f0003

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const v0, 0x7f0a0826

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const-string v0, "#333333"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->setSearchIconColor(Landroid/view/MenuItem;Ljava/lang/Integer;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->getSearchView()Lcom/miguelcatalan/materialsearchview/MaterialSearchView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/miguelcatalan/materialsearchview/MaterialSearchView;->setMenuItem(Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->getBtNext()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
