.class public final Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTeraBoxFileManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TeraBoxFileManagerActivity.kt\ncom/sma/smartv3/ui/device/TeraBoxFileManagerActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,448:1\n87#2,7:449\n94#2,3:457\n70#2,7:460\n97#2:467\n1#3:456\n35#4,2:468\n*S KotlinDebug\n*F\n+ 1 TeraBoxFileManagerActivity.kt\ncom/sma/smartv3/ui/device/TeraBoxFileManagerActivity\n*L\n123#1:449,7\n123#1:457,3\n123#1:460,7\n123#1:467\n123#1:456\n324#1:468,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTeraBoxFileManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TeraBoxFileManagerActivity.kt\ncom/sma/smartv3/ui/device/TeraBoxFileManagerActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,448:1\n87#2,7:449\n94#2,3:457\n70#2,7:460\n97#2:467\n1#3:456\n35#4,2:468\n*S KotlinDebug\n*F\n+ 1 TeraBoxFileManagerActivity.kt\ncom/sma/smartv3/ui/device/TeraBoxFileManagerActivity\n*L\n123#1:449,7\n123#1:457,3\n123#1:460,7\n123#1:467\n123#1:456\n324#1:468,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FILE_DIR:I = 0x1

.field public static final FILE_MUSIC:I


# instance fields
.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private access_tokens:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private hasLogin:Z

.field private hasNewIntent:Z

.field private mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter<",
            "Lcom/sma/smartv3/model/TeraBoxListItem;",
            ">;"
        }
    .end annotation
.end field

.field private final mButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCheckedListID:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/TeraBoxListItem;",
            ">;"
        }
    .end annotation
.end field

.field private final mClearImageView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurDir:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mEditText$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mEmptyView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mKeyIndex:Ljava/util/ArrayList;
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

.field private final mMapData:Ljava/util/HashMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TeraBoxListItem;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mMapTitle:Ljava/util/HashMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mRecyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSearchImageView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mShareView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSwipeRefreshLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTouches:Z

.field private onResumeSum:I

.field private page:I

.field private progressPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private unLoginPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->Companion:Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access_tokens:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xn5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xn5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zn5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zn5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mTitle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ao5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ao5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bo5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bo5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mEditText$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/co5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/co5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mClearImageView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/do5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/do5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mSearchImageView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/eo5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/eo5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mSwipeRefreshLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fo5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/fo5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/go5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mEmptyView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/io5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/io5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mShareView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yn5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yn5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mButton$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mMapData:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mMapTitle:Ljava/util/HashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mKeyIndex:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCheckedListID:Ljava/util/ArrayList;

    const-string v0, "/"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->page:I

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mEditText_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->initView$lambda$2(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    return-void
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mEmptyView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Ljava/lang/String;Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->showShareView$lambda$0(Ljava/lang/String;Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mClearImageView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getTeraBoxList$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mShareView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getTeraShareUrl$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->onTitleRightClick$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/lang/String;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getTeraBoxSearchFile$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/lang/String;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Landroid/view/View;)V

    return-void
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getMCheckedListID$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCheckedListID:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$getMCurDir$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getMKeyIndex$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mKeyIndex:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$getMMapData$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mMapData:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic access$getMMapTitle$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mMapTitle:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic access$getMTitle(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMTitle()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setMCurDir$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setPage$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->page:I

    return-void
.end method

.method private final analyzeURL(Landroid/net/Uri;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleIntent  -->  uri = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    const-string v0, "code"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->hasNewIntent:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->showLoadPopup()V

    sget-object v0, Lcom/sma/smartv3/biz/MusicServerManager;->OXO1:Lcom/sma/smartv3/biz/MusicServerManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ho5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ho5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-virtual {v0, p1, v1}, Lcom/sma/smartv3/biz/MusicServerManager;->IIX1OXO(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "handleIntent login error"

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private static final analyzeURL$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access_tokens:Ljava/lang/String;

    const-string p1, "/"

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getTeraBoxList()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getTeraShareUrl()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleIntent login error it = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->dismissLoadPopup()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMButton()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getMClearImageView()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mClearImageView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMEditText()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mEditText$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getMEmptyView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mEmptyView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getMSearchImageView()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mSearchImageView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMShareView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mShareView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMSwipeRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mSwipeRefreshLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    return-object v0
.end method

.method private final getMTitle()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private static final getTeraBoxList$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/util/List;)Lkotlin/Unit;
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mTouches:Z

    if-eqz p1, :cond_1

    iget v1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->page:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mMapData:Ljava/util/HashMap;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mKeyIndex:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mKeyIndex:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->initData(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMEmptyView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMSwipeRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->dismissLoadPopup()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final getTeraBoxSearchFile$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/lang/String;Ljava/util/List;)Lkotlin/Unit;
    .locals 4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mTouches:Z

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mMapData:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mMapTitle:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    const v2, 0x7f1411dc

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mKeyIndex:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->initData(Ljava/util/List;)V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->dismissLoadPopup()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final getTeraShareUrl$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->showShareView(Ljava/lang/String;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final handleIntent(Landroid/content/Intent;)V
    .locals 0

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->analyzeURL(Landroid/net/Uri;)V

    return-void
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mSearchImageView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->analyzeURL$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->onTitleRightClick$lambda$0$1(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mSwipeRefreshLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMEditText()Landroid/widget/EditText;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-interface {p0}, Landroid/text/Editable;->clear()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Landroid/view/View;)V
    .locals 4

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mTouches:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mTouches:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->showLoadPopup()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMEditText()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f1411dc

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMTitle()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getTeraBoxSearchFile(Ljava/lang/String;)V

    return-void
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->refreshData()V

    return-void
.end method

.method private static final mButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final mClearImageView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0b84

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mEditText_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0b83

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final mEmptyView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a035d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a0b85

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final mSearchImageView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0b86

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mShareView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0b88

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mSwipeRefreshLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .locals 1

    const v0, 0x7f0a0b87

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    return-object p0
.end method

.method private static final mTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final onTitleRightClick$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final onTitleRightClick$lambda$0$1(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Z
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "TERA_BOX_ACCESS_TOKEN"

    invoke-virtual {v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "TERA_BOX_REFRESH_TOKEN"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0
.end method

.method private final refreshData()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMSwipeRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getTeraBoxList()V

    return-void
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final showShareView$lambda$0(Ljava/lang/String;Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Landroid/view/View;)V
    .locals 3

    const/4 p2, 0x2

    const/4 v0, 0x0

    const-string v1, "http"

    const/4 v2, 0x0

    invoke-static {p0, v1, v2, p2, v0}, Lcom/android/mltcode/paycertificationapi/oe5;->O0(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    sget-object p0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/i72;->I0i1OXiI()Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "https://terabox.com/s/1aDs3IL6xbpMQvsbHZ6l0vg"

    goto :goto_0

    :cond_0
    const-string p0, "https://pan.baidu.com/s/1GatP9OXF9mmy2MTwtohHOw?pwd=k7y4"

    :cond_1
    :goto_0
    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string p0, "android.intent.action.VIEW"

    invoke-virtual {p2, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public final dismissLoadPopup()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->progressPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method public final getAccess_tokens()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access_tokens:Ljava/lang/String;

    return-object v0
.end method

.method public final getProgressPopup()Lcom/android/mltcode/paycertificationapi/uq;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->progressPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-object v0
.end method

.method public final getTeraBoxCode()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->I0i1OXiI()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    sget-object v1, Lcom/sma/smartv3/biz/MusicServerManager;->OXO1:Lcom/sma/smartv3/biz/MusicServerManager;

    invoke-virtual {v1, p0}, Lcom/sma/smartv3/biz/MusicServerManager;->IiI10X(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    sget-object v0, Lcom/sma/smartv3/biz/MusicServerManager;->OXO1:Lcom/sma/smartv3/biz/MusicServerManager;

    invoke-virtual {v0, p0}, Lcom/sma/smartv3/biz/MusicServerManager;->IiI10X(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v2, 0x2

    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/sma/smartv3/ui/me/WebViewActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final getTeraBoxList()V
    .locals 9

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mTouches:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mTouches:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->showLoadPopup()V

    sget-object v1, Lcom/sma/smartv3/biz/MusicServerManager;->OXO1:Lcom/sma/smartv3/biz/MusicServerManager;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access_tokens:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    iget v4, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->page:I

    new-instance v6, Lcom/android/mltcode/paycertificationapi/wn5;

    invoke-direct {v6, p0}, Lcom/android/mltcode/paycertificationapi/wn5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lcom/sma/smartv3/biz/MusicServerManager;->X0O(Lcom/sma/smartv3/biz/MusicServerManager;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public final getTeraBoxSearchFile(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/MusicServerManager;->OXO1:Lcom/sma/smartv3/biz/MusicServerManager;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access_tokens:Ljava/lang/String;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/jo5;

    invoke-direct {v2, p0, p1}, Lcom/android/mltcode/paycertificationapi/jo5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/sma/smartv3/biz/MusicServerManager;->XXI(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final getTeraShareUrl()V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/MusicServerManager;->OXO1:Lcom/sma/smartv3/biz/MusicServerManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ko5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ko5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/MusicServerManager;->OIX0iXi(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final getUnLoginPopup()Lcom/android/mltcode/paycertificationapi/go0;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->unLoginPopup:Lcom/android/mltcode/paycertificationapi/go0;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "TERA_BOX_ACCESS_TOKEN"

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access_tokens:Ljava/lang/String;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->onResumeSum:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->hasLogin:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getTeraBoxCode()V

    return-void

    :cond_0
    const-string p1, "/"

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getTeraBoxList()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getTeraShareUrl()V

    return-void
.end method

.method public final initData(Ljava/util/List;)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TeraBoxListItem;",
            ">;)V"
        }
    .end annotation

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->dismissLoadPopup()V

    new-instance v2, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1;

    invoke-direct {v2, p0, p1}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/util/List;)V

    iput-object v2, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMEmptyView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    if-nez v0, :cond_0

    const-string v0, "mAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMEmptyView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public initView()V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMTitle()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f141320

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->progressPopup:Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMButton()Landroid/widget/Button;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mMapTitle:Ljava/util/HashMap;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v3, 0x1

    invoke-direct {v1, p0, v3, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access_tokens:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f081795

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f06074b

    invoke-static {p0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMClearImageView()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/lo5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/lo5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMSearchImageView()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mo5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/mo5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "TERA_BOX_SHARE_URL"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->showShareView(Ljava/lang/String;)V

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMSwipeRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/no5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/no5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0128

    return v0
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCheckedListID:Ljava/util/ArrayList;

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "TERA_BOX_CHECK_LIST_ID"

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {v1, p1, v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    const-string v1, "/"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mKeyIndex:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    if-lez v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mKeyIndex:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mKeyIndex:Ljava/util/ArrayList;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    :cond_1
    iput-object v1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMTitle()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mMapTitle:Ljava/util/HashMap;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "back mCurDir = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mMapData:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCurDir:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->initData(Ljava/util/List;)V

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->handleIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public onResume()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    iget v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->onResumeSum:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->onResumeSum:I

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->hasLogin:Z

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->hasNewIntent:Z

    if-nez v2, :cond_0

    if-le v0, v1, :cond_0

    const v0, 0x7f140e30

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->onHandleBackPressed()V

    return-void
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p1, v0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f140e3c

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/po5;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/po5;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qo5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/qo5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    const v1, 0x7f14034b

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->unLoginPopup:Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->unLoginPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method public final setAccess_tokens(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access_tokens:Ljava/lang/String;

    return-void
.end method

.method public final setButtonText()V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMButton()Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCheckedListID:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const v2, 0x7f14131f

    if-nez v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMButton()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMButton()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->mCheckedListID:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public final setProgressPopup(Lcom/android/mltcode/paycertificationapi/uq;)V
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/uq;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->progressPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-void
.end method

.method public final setUnLoginPopup(Lcom/android/mltcode/paycertificationapi/go0;)V
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/go0;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->unLoginPopup:Lcom/android/mltcode/paycertificationapi/go0;

    return-void
.end method

.method public final showLoadPopup()V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->dismissLoadPopup()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->progressPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final showShareView(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMShareView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getMShareView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/oo5;

    invoke-direct {v1, p1, p0}, Lcom/android/mltcode/paycertificationapi/oo5;-><init>(Ljava/lang/String;Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
