.class public final Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInterpretationRecordsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterpretationRecordsActivity.kt\ncom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1#2:183\n1#2:191\n87#3,7:184\n94#3,3:192\n70#3,7:195\n97#3:202\n1869#4,2:203\n*S KotlinDebug\n*F\n+ 1 InterpretationRecordsActivity.kt\ncom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity\n*L\n104#1:191\n104#1:184,7\n104#1:192,3\n104#1:195,7\n104#1:202\n138#1:203,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nInterpretationRecordsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterpretationRecordsActivity.kt\ncom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1#2:183\n1#2:191\n87#3,7:184\n94#3,3:192\n70#3,7:195\n97#3:202\n1869#4,2:203\n*S KotlinDebug\n*F\n+ 1 InterpretationRecordsActivity.kt\ncom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity\n*L\n104#1:191\n104#1:184,7\n104#1:192,3\n104#1:195,7\n104#1:202\n138#1:203,2\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mList:Ljava/util/List;
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


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    const-string v0, "InterpretationRecordsActivity"

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->TAG:Ljava/lang/String;

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->aiRecordsDao()Lcom/sma/smartv3/db/dao/AIRecordsDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ba;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ba;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ca;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ca;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->setList$lambda$0$0$1(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->showDeleteTipPopup$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->showDeleteTipPopup$lambda$0$1(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->setList$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->setList$lambda$0$0$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->setList$lambda$0$0$0$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->setList$lambda$0$0$0$0$1(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->setList$lambda$0$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method private final setList()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->initList()Ljava/util/List;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->mList:Ljava/util/List;

    if-nez v2, :cond_0

    const-string v2, "mList"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " list = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ka;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ka;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final setList$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->getItemSelectorHelper()Lcom/angcyo/dsladapter/ItemSelectorHelper;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/ItemSelectorHelper;->X11iII1O1(I)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ha;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/ha;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/angcyo/dsladapter/DslAdapter;)V

    const-wide/16 p0, 0x1f4

    invoke-virtual {v0, p0, p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setList$lambda$0$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 10

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->mList:Ljava/util/List;

    if-nez v0, :cond_0

    const-string v0, "mList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v2

    new-instance v3, Lcom/android/mltcode/paycertificationapi/ea;

    invoke-direct {v3, p0, v1}, Lcom/android/mltcode/paycertificationapi/ea;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;)V

    const v1, 0x7f0d0ef1

    invoke-static {v2, v1, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_1
    new-instance v7, Lcom/android/mltcode/paycertificationapi/fa;

    invoke-direct {v7}, Lcom/android/mltcode/paycertificationapi/fa;-><init>()V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v9}, Lcom/angcyo/dsladapter/DslAdapter;->render$default(Lcom/angcyo/dsladapter/DslAdapter;ZLcom/angcyo/dsladapter/XIi00iiXO;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setList$lambda$0$0$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ga;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/ga;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setList$lambda$0$0$0$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string p3, "itemHolder"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "adapterItem"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "<unused var>"

    invoke-static {p5, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p4, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->TAG:Ljava/lang/String;

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " mAIRecords item = "

    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const p3, 0x7f0a054d

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p3

    if-eqz p3, :cond_0

    const p4, 0x7f1411c6

    invoke-virtual {p0, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p4

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ":"

    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const p3, 0x7f0a054c

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMTranslateLanguage()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const p3, 0x7f0a0551

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMTranslateToLanguage()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    const p3, 0x7f0a054a

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p3

    if-eqz p3, :cond_3

    const p4, 0x7f140060

    invoke-virtual {p0, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMAudioDuration()I

    move-result p5

    invoke-static {p5}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object p5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": "

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    const p3, 0x7f0a0550

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p3

    if-eqz p3, :cond_4

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMAITitle()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    const p3, 0x7f0a0549

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p3

    if-eqz p3, :cond_5

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMExtraInfo()Ljava/lang/String;

    move-result-object p5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    const p3, 0x7f0a054e

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p3

    if-eqz p3, :cond_7

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMLocation()Ljava/lang/String;

    move-result-object p4

    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result p5

    if-nez p5, :cond_6

    const-string p4, "-"

    :cond_6
    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    const p3, 0x7f0a054f

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p3

    if-eqz p3, :cond_8

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMLocalTime()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    new-instance p3, Lcom/android/mltcode/paycertificationapi/da;

    invoke-direct {p3, p0, p1}, Lcom/android/mltcode/paycertificationapi/da;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;)V

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->clickItem(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setList$lambda$0$0$0$0$1(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;Lcom/sma/smartv3/db/entity/AIRecords;Landroid/view/View;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

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

    const-class v0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setList$lambda$0$0$1(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$render"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showDeleteTipPopup$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final showDeleteTipPopup$lambda$0$1(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;)Z
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->mList:Ljava/util/List;

    const-string v1, "mList"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {v3, v4}, Lcom/sma/smartv3/db/entity/AIRecords;->setMIsDelete(I)V

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/sma/smartv3/db/entity/AIRecords;->setMIsSync(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->mList:Ljava/util/List;

    if-nez v3, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v2

    :cond_2
    invoke-interface {v0, v3}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->update(Ljava/util/List;)I

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->mList:Ljava/util/List;

    if-nez v0, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->setList()V

    const p0, 0x7f1402dd

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    const-string p0, "AI_Answer_stop_player"

    const/4 v0, 0x2

    invoke-static {p0, v2, v0, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return v4
.end method


# virtual methods
.method public final getAbhTitleCenter()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMRecordsDao()Lcom/sma/smartv3/db/dao/AIRecordsDao;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

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

.method public final initList()Ljava/util/List;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    sget-object v1, Lcom/sma/smartv3/model/AIFunctionType;->SIMULTANEOUS_INTERPRETATION:Lcom/sma/smartv3/model/AIFunctionType;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AIFunctionType;->getType()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->getListDESC(I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->mList:Ljava/util/List;

    if-nez v0, :cond_0

    const-string v0, "mList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140d2a

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const v1, 0x7f08065f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00b8

    return v0
.end method

.method public onInitBaseLayoutAfter()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->onInitBaseLayoutAfter()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->setList()V

    return-void
.end method

.method public final onRefreshList(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "REFRESH_INTERPRETATION_RECORDS"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onFirmwareRepair"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->setList()V

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

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->showDeleteTipPopup()V

    return-void
.end method

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final showDeleteTipPopup()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f141348

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f1402d2

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

    new-instance v2, Lcom/android/mltcode/paycertificationapi/ia;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/ia;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ja;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ja;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;)V

    const v2, 0x7f14034b

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;->mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method
