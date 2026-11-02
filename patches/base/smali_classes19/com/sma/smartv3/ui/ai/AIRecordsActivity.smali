.class public Lcom/sma/smartv3/ui/ai/AIRecordsActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/ai/AIRecordsActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAIRecordsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIRecordsActivity.kt\ncom/sma/smartv3/ui/ai/AIRecordsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1869#2,2:281\n1869#2,2:302\n173#3,7:283\n180#3,3:291\n143#3,7:294\n183#3:301\n1#4:290\n*S KotlinDebug\n*F\n+ 1 AIRecordsActivity.kt\ncom/sma/smartv3/ui/ai/AIRecordsActivity\n*L\n190#1:281,2\n250#1:302,2\n140#1:283,7\n140#1:291,3\n140#1:294,7\n140#1:301\n140#1:290\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAIRecordsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIRecordsActivity.kt\ncom/sma/smartv3/ui/ai/AIRecordsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1869#2,2:281\n1869#2,2:302\n173#3,7:283\n180#3,3:291\n143#3,7:294\n183#3:301\n1#4:290\n*S KotlinDebug\n*F\n+ 1 AIRecordsActivity.kt\ncom/sma/smartv3/ui/ai/AIRecordsActivity\n*L\n190#1:281,2\n250#1:302,2\n140#1:283,7\n140#1:291,3\n140#1:294,7\n140#1:301\n140#1:290\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/ai/AIRecordsActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final REQUEST_DELETE:I = 0xff


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAIFunction:Lcom/sma/smartv3/model/AIFunction;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public mAdapterData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AIRecordsViewData;",
            ">;"
        }
    .end annotation
.end field

.field private mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;"
        }
    .end annotation
.end field

.field private final mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private showItemClick:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->Companion:Lcom/sma/smartv3/ui/ai/AIRecordsActivity$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    const-string v0, "AIRecords"

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OI1IiOO1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OI1IiOO1i;-><init>(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->aiRecordsDao()Lcom/sma/smartv3/db/dao/AIRecordsDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showItemClick:Z

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/model/AIRecordsViewData;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showList$lambda$0$0$0(Lcom/sma/smartv3/model/AIRecordsViewData;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showAllDeletePopup$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/sma/smartv3/model/AIRecordsViewData;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showList$lambda$0$0$0$2(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/sma/smartv3/model/AIRecordsViewData;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Ljava/util/List;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showList$lambda$0(Ljava/util/List;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showList$lambda$0$0$0$1(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/model/AIRecordsViewData;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showList$lambda$0$0(Lcom/sma/smartv3/model/AIRecordsViewData;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showList$lambda$0$0$0$0(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;I)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showDeletePopup$lambda$0$1(Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showAllDeletePopup$lambda$0$1(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;)Z

    move-result p0

    return p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public static synthetic iIiiO()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showDeletePopup$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method private static final showAllDeletePopup$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final showAllDeletePopup$lambda$0$1(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;)Z
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mList:Ljava/util/List;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/db/entity/AIRecords;->setMIsDelete(I)V

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/db/entity/AIRecords;->setMIsSync(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mList:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->update(Ljava/util/List;)I

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->getMAdapterData()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->getMAdapterData()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showList(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    const p0, 0x7f1402dd

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    const-string p0, "AI_Answer_stop_player"

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return v1
.end method

.method private static final showDeletePopup$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final showDeletePopup$lambda$0$1(Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;I)Z
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/db/entity/AIRecords;->setMIsDelete(I)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/db/entity/AIRecords;->setMIsSync(I)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/db/entity/AIRecords;->setMIsDelete(I)V

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/db/entity/AIRecords;->setMIsSync(I)V

    iget-object v1, p2, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    invoke-interface {v1, p0}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->update(Lcom/sma/smartv3/db/entity/AIRecords;)I

    iget-object p0, p2, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    invoke-interface {p0, p1}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->update(Lcom/sma/smartv3/db/entity/AIRecords;)I

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->getMAdapterData()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->getMAdapterData()Ljava/util/List;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showList(Ljava/util/List;)V

    invoke-virtual {p2}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    const p0, 0x7f1412e0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    const/4 p0, 0x0

    const/4 p1, 0x2

    const-string p3, "AI_Answer_stop_player"

    invoke-static {p3, p0, p1, p0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    iget-boolean p0, p2, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showItemClick:Z

    if-nez p0, :cond_0

    const/4 p0, -0x1

    invoke-virtual {p2, p0}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p2}, Landroid/app/Activity;->finish()V

    :cond_0
    return v0
.end method

.method private static final showList$lambda$0(Ljava/util/List;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 4

    const-string v0, "$this$renderAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p0, p1, v2, v1, v2}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v1, v2}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/AIRecordsViewData;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XOO0Xi;

    invoke-direct {v1, v0, p1}, Lcom/android/mltcode/paycertificationapi/XOO0Xi;-><init>(Lcom/sma/smartv3/model/AIRecordsViewData;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;)V

    const v0, 0x7f0d0eba

    invoke-static {p2, v0, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_1
    :goto_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0(Lcom/sma/smartv3/model/AIRecordsViewData;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iIIIi;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/iIIIi;-><init>(Lcom/sma/smartv3/model/AIRecordsViewData;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0$0(Lcom/sma/smartv3/model/AIRecordsViewData;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 9

    const-string v0, "itemHolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AIRecordsViewData;->getFirst()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object p4

    invoke-static {p4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AIRecordsViewData;->getLast()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object p5

    invoke-static {p5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const v0, 0x7f14112b

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " : "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, p1, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showItemClick:Z

    const v3, 0x7f0a0562

    const v4, 0x7f140c45

    const v5, 0x7f0a0563

    const v6, 0x7f0a0560

    if-eqz v2, :cond_5

    invoke-virtual {p1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p5}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v7

    if-eqz v7, :cond_0

    const/16 v8, 0x12c

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setMaxHeight(I)V

    :cond_0
    invoke-virtual {p2, v6}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v7

    const/4 v8, 0x0

    if-eqz v7, :cond_1

    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    invoke-virtual {p2, v5}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    invoke-virtual {p2, v6}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_3

    new-instance v7, Lcom/android/mltcode/paycertificationapi/I011X;

    invoke-direct {v7, p1, p4, p5, p3}, Lcom/android/mltcode/paycertificationapi/I011X;-><init>(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;I)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    invoke-virtual {p2, v5}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p3

    if-eqz p3, :cond_4

    new-instance p4, Lcom/android/mltcode/paycertificationapi/iiX0i1IX;

    invoke-direct {p4, p1, v1, v2}, Lcom/android/mltcode/paycertificationapi/iiX0i1IX;-><init>(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance p4, Lcom/android/mltcode/paycertificationapi/OI1i1i;

    invoke-direct {p4, p1, p0}, Lcom/android/mltcode/paycertificationapi/OI1i1i;-><init>(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/sma/smartv3/model/AIRecordsViewData;)V

    invoke-virtual {p3, p4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p2, v6}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p0

    const/16 p3, 0x8

    if-eqz p0, :cond_6

    invoke-virtual {p0, p3}, Landroid/view/View;->setVisibility(I)V

    :cond_6
    invoke-virtual {p2, v5}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-virtual {p0, p3}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    :goto_0
    const p0, 0x7f0a0561

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p0

    if-eqz p0, :cond_8

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-boolean p3, p1, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showItemClick:Z

    xor-int/lit8 p3, p3, 0x1

    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    :cond_8
    invoke-virtual {p2, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p0

    if-eqz p0, :cond_9

    iget-boolean p3, p1, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showItemClick:Z

    xor-int/lit8 p3, p3, 0x1

    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    :cond_9
    invoke-static {p0}, Lcom/blankj/utilcode/util/SpanUtils;->with(Landroid/widget/TextView;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object p0

    invoke-virtual {p1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object p0

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p1

    const p3, 0x7f060022

    invoke-static {p1, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/blankj/utilcode/util/SpanUtils;->setForegroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object p0

    invoke-virtual {p5}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object p0

    invoke-virtual {p0}, Lcom/blankj/utilcode/util/SpanUtils;->create()Landroid/text/SpannableStringBuilder;

    const p0, 0x7f0a0564

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-virtual {p5}, Lcom/sma/smartv3/db/entity/AIRecords;->getMLocalTime()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_a
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0$0$0(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;ILandroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showDeletePopup(Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;I)V

    return-void
.end method

.method private static final showList$lambda$0$0$0$1(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n\n"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->share(Ljava/lang/String;)V

    return-void
.end method

.method private static final showList$lambda$0$0$0$2(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;Lcom/sma/smartv3/model/AIRecordsViewData;Landroid/view/View;)V
    .locals 2

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg2"

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p2, v0, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/16 p2, 0xff

    invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method public final getMAIFunction()Lcom/sma/smartv3/model/AIFunction;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mAIFunction:Lcom/sma/smartv3/model/AIFunction;

    return-object v0
.end method

.method public final getMAdapterData()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AIRecordsViewData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mAdapterData:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mAdapterData"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mList:Ljava/util/List;

    return-object v0
.end method

.method public final getMRecordsDao()Lcom/sma/smartv3/db/dao/AIRecordsDao;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    return-object v0
.end method

.method public final getShowItemClick()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showItemClick:Z

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.model.AIFunction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/AIFunction;

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mAIFunction:Lcom/sma/smartv3/model/AIFunction;

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AIRecordsViewData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mAIFunction:Lcom/sma/smartv3/model/AIFunction;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AIFunctionType;->getType()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->getListASC(I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mList:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->setMAdapterData(Ljava/util/List;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mList:Ljava/util/List;

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v1, v2

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/AIRecords;->getMType()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_2

    new-instance v1, Lcom/sma/smartv3/model/AIRecordsViewData;

    const/4 v4, 0x3

    invoke-direct {v1, v2, v2, v4, v2}, Lcom/sma/smartv3/model/AIRecordsViewData;-><init>(Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/AIRecordsViewData;->setFirst(Lcom/sma/smartv3/db/entity/AIRecords;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/AIRecords;->getMType()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/AIRecordsViewData;->setLast(Lcom/sma/smartv3/db/entity/AIRecords;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->getMAdapterData()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->getMAdapterData()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IOOIXiI1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->setMAdapterData(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->getMAdapterData()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 10

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const v1, 0x7f140cde

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08062f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f06074b

    invoke-static {p0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->getDslAdapterStatusItem()Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/BaseDslStateItem;->getItemStateLayoutMap()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x7f0d0f5a

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->initList()Ljava/util/List;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->getMAdapterData()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showList(Ljava/util/List;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IX0iIX()Z

    move-result v1

    const-string v2, " -> id:"

    if-eqz v1, :cond_1

    const v0, 0x7f0a0097

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    if-eqz v3, :cond_2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->TAG:Ljava/lang/String;

    invoke-virtual {v3}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->getAdUnitId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;)V

    invoke-virtual {v3, v0}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->setAdListener(Lcom/sma/smartv3/biz/ad/ADPCAdListener;)V

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->loadAdView$default(Lcom/sma/smartv3/view/ad/ADPCAdContainerView;Ljava/lang/String;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IOi1O0()Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x7f0a008b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    if-eqz v3, :cond_2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->TAG:Ljava/lang/String;

    invoke-virtual {v3}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->getAdUnitId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity$iO;-><init>(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;)V

    invoke-virtual {v3, v0}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->setAdListener(Lcom/sma/smartv3/biz/ad/ADPAdListener;)V

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->loadAdView$default(Lcom/sma/smartv3/view/ad/ADPAdContainerView;Ljava/lang/String;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d002a

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p3, -0x1

    if-ne p2, p3, :cond_0

    const/16 p2, 0xff

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->initList()Ljava/util/List;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->getMAdapterData()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showList(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public onRefresh()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->initList()Ljava/util/List;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

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
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showAllDeletePopup()V

    return-void
.end method

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const v0, 0x7f0a0b16

    return v0
.end method

.method public final setMAIFunction(Lcom/sma/smartv3/model/AIFunction;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/AIFunction;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mAIFunction:Lcom/sma/smartv3/model/AIFunction;

    return-void
.end method

.method public final setMAdapterData(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AIRecordsViewData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mAdapterData:Ljava/util/List;

    return-void
.end method

.method public final setMList(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mList:Ljava/util/List;

    return-void
.end method

.method public final setShowItemClick(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showItemClick:Z

    return-void
.end method

.method public final share(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/blankj/utilcode/util/ClipboardUtils;->copyText(Ljava/lang/CharSequence;)V

    invoke-static {p1}, Lcom/blankj/utilcode/util/IntentUtils;->getShareTextIntent(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final showAllDeletePopup()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f141348

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f1402d4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->IXXOO(Ljava/lang/Integer;)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X11;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/X11;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OXii10I;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OXii10I;-><init>(Lcom/sma/smartv3/ui/ai/AIRecordsActivity;)V

    const v2, 0x7f14034b

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method public final showDeletePopup(Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;I)V
    .locals 4
    .param p1    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mQuestion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mResults"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f141348

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f1402d1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->IXXOO(Ljava/lang/Integer;)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/IiiiOIIi0;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/IiiiOIIi0;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iO11i;

    invoke-direct {v1, p1, p2, p0, p3}, Lcom/android/mltcode/paycertificationapi/iO11i;-><init>(Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;I)V

    const p1, 0x7f14034b

    invoke-virtual {v0, p1, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->mDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method public final showList(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AIRecordsViewData;",
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/II1;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/II1;-><init>(Ljava/util/List;Lcom/sma/smartv3/ui/ai/AIRecordsActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
