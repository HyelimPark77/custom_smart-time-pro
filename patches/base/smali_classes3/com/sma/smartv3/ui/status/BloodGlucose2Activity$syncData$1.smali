.class public final Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$syncData$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->syncData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "[",
        "Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBloodGlucose2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucose2Activity.kt\ncom/sma/smartv3/ui/status/BloodGlucose2Activity$syncData$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,287:1\n13805#2,2:288\n*S KotlinDebug\n*F\n+ 1 BloodGlucose2Activity.kt\ncom/sma/smartv3/ui/status/BloodGlucose2Activity$syncData$1\n*L\n102#1:288,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBloodGlucose2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucose2Activity.kt\ncom/sma/smartv3/ui/status/BloodGlucose2Activity$syncData$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,287:1\n13805#2,2:288\n*S KotlinDebug\n*F\n+ 1 BloodGlucose2Activity.kt\ncom/sma/smartv3/ui/status/BloodGlucose2Activity$syncData$1\n*L\n102#1:288,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$syncData$1;->OXO1:Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1([Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;)V
    .locals 4

    if-eqz p1, :cond_1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->toBloodGlucose2()Lcom/sma/smartv3/db/entity/BloodGlucose2;

    move-result-object v2

    if-eqz v2, :cond_0

    sget-object v3, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/AppDatabase;->bloodGlucose2Dao()Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    move-result-object v3

    filled-new-array {v2}, [Lcom/sma/smartv3/db/entity/BloodGlucose2;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iIiiO([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v3, v2}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->insert(Ljava/util/List;)[J

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$syncData$1;->OXO1:Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->showData(Ljava/lang/Object;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$syncData$1;->OXO1([Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;)V

    return-void
.end method
