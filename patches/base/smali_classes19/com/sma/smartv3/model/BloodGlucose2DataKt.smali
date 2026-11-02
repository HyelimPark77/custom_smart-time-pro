.class public final Lcom/sma/smartv3/model/BloodGlucose2DataKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final bloodGlucoseSegments:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/iz3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060062

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/high16 v2, 0x41f00000    # 30.0f

    const/high16 v3, 0x42740000    # 61.0f

    invoke-direct {v0, v2, v3, v1}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFI)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f060064

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    const/high16 v4, 0x428a0000    # 69.0f

    invoke-direct {v1, v3, v4, v2}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFI)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v5, 0x7f06005e

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    const/high16 v5, 0x42b40000    # 90.0f

    invoke-direct {v2, v4, v5, v3}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFI)V

    filled-new-array {v0, v1, v2}, [Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->bloodGlucoseSegments:Ljava/util/List;

    return-void
.end method

.method public static final getBloodGlucoseBarValue(FF)F
    .locals 0

    sub-float/2addr p0, p1

    return p0
.end method

.method public static synthetic getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    sget-object p1, Lcom/sma/smartv3/model/BloodGlucoseLevel;->START:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BloodGlucoseLevel;->getMValue()F

    move-result p1

    :cond_0
    invoke-static {p0, p1}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue(FF)F

    move-result p0

    return p0
.end method

.method public static final getBloodGlucoseSegments()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/iz3;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->bloodGlucoseSegments:Ljava/util/List;

    return-object v0
.end method
