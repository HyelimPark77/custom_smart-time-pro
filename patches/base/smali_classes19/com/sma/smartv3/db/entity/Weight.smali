.class public final Lcom/sma/smartv3/db/entity/Weight;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build Landroidx/room/Entity;
    indices = {
        .subannotation Landroidx/room/Index;
            unique = true
            value = {
                "mTime"
            }
        .end subannotation
    }
.end annotation

.annotation build Landroidx/room/TypeConverters;
    value = {
        Lcom/sma/smartv3/db/entity/ListDoubleConverter;
    }
.end annotation


# instance fields
.field private mAgeOfBody:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAgeOfBodyRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mBmi:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mBmiRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mBmiWHORange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mBmr:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mBmrRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mBodyShape:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mDesirableWeight:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mFatFreeBodyWeight:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mFatToControl:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private final mId:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Landroidx/room/PrimaryKey;
        autoGenerate = true
    .end annotation
.end field

.field private mIdealWeight:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mIsDelete:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mIsMeasure:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mIsSync:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mLevelOfVisceralFat:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mLevelOfVisceralFatRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mLocalTime:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mMuscleToControl:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mRatioOfFat:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mRatioOfFatRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mRatioOfMuscle:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mRatioOfMuscleRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mRatioOfProtein:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mRatioOfProteinLevel:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mRatioOfProteinRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mRatioOfSkeletalMuscle:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mRatioOfSkeletalMuscleRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mRatioOfSubcutaneousFat:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mRatioOfSubcutaneousFatRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mRatioOfWater:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mRatioOfWaterLevel:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mRatioOfWaterRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mScore:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mStateOfNutrition:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mWeight:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mWeightOfBone:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mWeightOfBoneRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mWeightOfFat:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mWeightOfFatRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mWeightOfMuscle:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mWeightOfMuscleRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mWeightOfProtein:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mWeightOfProteinRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mWeightOfSkeletalMuscle:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mWeightOfSkeletalMuscleRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mWeightOfWater:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mWeightOfWaterRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mWeightRange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private mWeightToControl:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mWeightWHORange:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 83

    .line 1
    const v81, 0x1fffff

    const/16 v82, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const-wide/16 v34, 0x0

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const-wide/16 v40, 0x0

    const/16 v42, 0x0

    const-wide/16 v43, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const-wide/16 v50, 0x0

    const/16 v52, 0x0

    const-wide/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const-wide/16 v57, 0x0

    const-wide/16 v59, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const-wide/16 v64, 0x0

    const/16 v66, 0x0

    const-wide/16 v67, 0x0

    const/16 v69, 0x0

    const-wide/16 v70, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const-wide/16 v74, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v80, -0x1

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v82}, Lcom/sma/smartv3/db/entity/Weight;-><init>(IJLjava/lang/String;FIIDDDDDDDDDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DDDDDLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJLjava/lang/String;FIIDDDDDDDDDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DDDDDLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;III)V
    .locals 16
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p26    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p27    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p28    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p31    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p42    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p45    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p48    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p49    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p52    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p55    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p56    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p61    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p62    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p63    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p66    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p69    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p72    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p73    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p76    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Ljava/lang/String;",
            "FIIDDDDDDDDD",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;DDDDD",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;DD",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;III)V"
        }
    .end annotation

    move-object/from16 v1, p4

    move-object/from16 v2, p26

    move-object/from16 v3, p27

    move-object/from16 v4, p28

    move-object/from16 v5, p31

    move-object/from16 v6, p42

    move-object/from16 v7, p45

    move-object/from16 v8, p48

    move-object/from16 v9, p49

    move-object/from16 v10, p52

    move-object/from16 v11, p55

    move-object/from16 v12, p56

    move-object/from16 v13, p61

    move-object/from16 v14, p62

    move-object/from16 v15, p63

    const-string v0, "mLocalTime"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAgeOfBodyRange"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBmiRange"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBmiWHORange"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBmrRange"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLevelOfVisceralFatRange"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRatioOfFatRange"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRatioOfMuscleRange"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRatioOfProteinRange"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRatioOfSkeletalMuscleRange"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRatioOfSubcutaneousFatRange"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRatioOfWaterRange"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightOfBoneRange"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightOfFatRange"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightOfMuscleRange"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightOfProteinRange"

    move-object/from16 v15, p66

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightOfSkeletalMuscleRange"

    move-object/from16 v15, p69

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightOfWaterRange"

    move-object/from16 v15, p72

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightRange"

    move-object/from16 v15, p73

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightWHORange"

    move-object/from16 v15, p76

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    move/from16 v15, p1

    .line 3
    iput v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mId:I

    move-wide/from16 v14, p2

    .line 4
    iput-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mTime:J

    .line 5
    iput-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mLocalTime:Ljava/lang/String;

    move/from16 v1, p5

    .line 6
    iput v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeight:F

    move/from16 v1, p6

    .line 7
    iput v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mIsSync:I

    move/from16 v1, p7

    .line 8
    iput v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mIsMeasure:I

    move-wide/from16 v14, p8

    .line 9
    iput-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mBmi:D

    move-wide/from16 v14, p10

    .line 10
    iput-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFat:D

    move-wide/from16 v14, p12

    .line 11
    iput-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscle:D

    move-wide/from16 v14, p14

    .line 12
    iput-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFat:D

    move-wide/from16 v14, p16

    .line 13
    iput-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProtein:D

    move-wide/from16 v14, p18

    .line 14
    iput-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWater:D

    move-wide/from16 v14, p20

    .line 15
    iput-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mStateOfNutrition:D

    move-wide/from16 v14, p22

    .line 16
    iput-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mIdealWeight:D

    move-wide/from16 v14, p24

    .line 17
    iput-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBody:D

    .line 18
    iput-object v2, v0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBodyRange:Ljava/util/List;

    .line 19
    iput-object v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mBmiRange:Ljava/util/List;

    .line 20
    iput-object v4, v0, Lcom/sma/smartv3/db/entity/Weight;->mBmiWHORange:Ljava/util/List;

    move-wide/from16 v1, p29

    .line 21
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mBmr:D

    .line 22
    iput-object v5, v0, Lcom/sma/smartv3/db/entity/Weight;->mBmrRange:Ljava/util/List;

    move-wide/from16 v1, p32

    .line 23
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mBodyShape:D

    move-wide/from16 v1, p34

    .line 24
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mDesirableWeight:D

    move-wide/from16 v1, p36

    .line 25
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mFatFreeBodyWeight:D

    move-wide/from16 v1, p38

    .line 26
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mFatToControl:D

    move-wide/from16 v1, p40

    .line 27
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFat:D

    .line 28
    iput-object v6, v0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFatRange:Ljava/util/List;

    move-wide/from16 v1, p43

    .line 29
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mMuscleToControl:D

    .line 30
    iput-object v7, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFatRange:Ljava/util/List;

    move-wide/from16 v1, p46

    .line 31
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscle:D

    .line 32
    iput-object v8, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscleRange:Ljava/util/List;

    .line 33
    iput-object v9, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinRange:Ljava/util/List;

    move-wide/from16 v1, p50

    .line 34
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscle:D

    .line 35
    iput-object v10, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscleRange:Ljava/util/List;

    move-wide/from16 v1, p53

    .line 36
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFat:D

    .line 37
    iput-object v11, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFatRange:Ljava/util/List;

    .line 38
    iput-object v12, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterRange:Ljava/util/List;

    move-wide/from16 v1, p57

    .line 39
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mScore:D

    move-wide/from16 v1, p59

    .line 40
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBone:D

    .line 41
    iput-object v13, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBoneRange:Ljava/util/List;

    move-object/from16 v14, p62

    .line 42
    iput-object v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFatRange:Ljava/util/List;

    move-object/from16 v15, p63

    .line 43
    iput-object v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscleRange:Ljava/util/List;

    move-wide/from16 v1, p64

    .line 44
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProtein:D

    move-object/from16 v15, p66

    .line 45
    iput-object v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProteinRange:Ljava/util/List;

    move-wide/from16 v1, p67

    .line 46
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscle:D

    move-object/from16 v15, p69

    .line 47
    iput-object v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscleRange:Ljava/util/List;

    move-wide/from16 v1, p70

    .line 48
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWater:D

    move-object/from16 v15, p72

    .line 49
    iput-object v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWaterRange:Ljava/util/List;

    move-object/from16 v15, p73

    .line 50
    iput-object v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightRange:Ljava/util/List;

    move-wide/from16 v1, p74

    .line 51
    iput-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightToControl:D

    move-object/from16 v15, p76

    .line 52
    iput-object v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightWHORange:Ljava/util/List;

    move/from16 v1, p77

    .line 53
    iput v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mIsDelete:I

    move/from16 v1, p78

    .line 54
    iput v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinLevel:I

    move/from16 v1, p79

    .line 55
    iput v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterLevel:I

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/String;FIIDDDDDDDDDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DDDDDLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 77

    move/from16 v0, p80

    move/from16 v1, p81

    and-int/lit8 v2, v0, 0x1

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v0, 0x2

    if-eqz v4, :cond_1

    const-wide/16 v4, 0x0

    goto :goto_1

    :cond_1
    move-wide/from16 v4, p2

    :goto_1
    and-int/lit8 v6, v0, 0x4

    if-eqz v6, :cond_2

    .line 56
    const-string v6, ""

    goto :goto_2

    :cond_2
    move-object/from16 v6, p4

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    const/4 v7, 0x0

    goto :goto_3

    :cond_3
    move/from16 v7, p5

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    const/4 v8, 0x0

    goto :goto_4

    :cond_4
    move/from16 v8, p6

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    const/4 v9, 0x0

    goto :goto_5

    :cond_5
    move/from16 v9, p7

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    const-wide/16 v13, 0x0

    goto :goto_6

    :cond_6
    move-wide/from16 v13, p8

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    const-wide/16 v15, 0x0

    goto :goto_7

    :cond_7
    move-wide/from16 v15, p10

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    const-wide/16 v17, 0x0

    goto :goto_8

    :cond_8
    move-wide/from16 v17, p12

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    const-wide/16 v19, 0x0

    goto :goto_9

    :cond_9
    move-wide/from16 v19, p14

    :goto_9
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    const-wide/16 v21, 0x0

    goto :goto_a

    :cond_a
    move-wide/from16 v21, p16

    :goto_a
    and-int/lit16 v10, v0, 0x800

    if-eqz v10, :cond_b

    const-wide/16 v23, 0x0

    goto :goto_b

    :cond_b
    move-wide/from16 v23, p18

    :goto_b
    and-int/lit16 v10, v0, 0x1000

    if-eqz v10, :cond_c

    const-wide/16 v25, 0x0

    goto :goto_c

    :cond_c
    move-wide/from16 v25, p20

    :goto_c
    and-int/lit16 v10, v0, 0x2000

    if-eqz v10, :cond_d

    const-wide/16 v27, 0x0

    goto :goto_d

    :cond_d
    move-wide/from16 v27, p22

    :goto_d
    and-int/lit16 v10, v0, 0x4000

    if-eqz v10, :cond_e

    const-wide/16 v29, 0x0

    goto :goto_e

    :cond_e
    move-wide/from16 v29, p24

    :goto_e
    const v10, 0x8000

    and-int v31, v0, v10

    if-eqz v31, :cond_f

    .line 57
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v31

    goto :goto_f

    :cond_f
    move-object/from16 v31, p26

    :goto_f
    const/high16 v32, 0x10000

    and-int v33, v0, v32

    if-eqz v33, :cond_10

    .line 58
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v33

    goto :goto_10

    :cond_10
    move-object/from16 v33, p27

    :goto_10
    const/high16 v34, 0x20000

    and-int v35, v0, v34

    if-eqz v35, :cond_11

    .line 59
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v35

    goto :goto_11

    :cond_11
    move-object/from16 v35, p28

    :goto_11
    const/high16 v36, 0x40000

    and-int v37, v0, v36

    if-eqz v37, :cond_12

    const-wide/16 v37, 0x0

    goto :goto_12

    :cond_12
    move-wide/from16 v37, p29

    :goto_12
    const/high16 v39, 0x80000

    and-int v40, v0, v39

    if-eqz v40, :cond_13

    .line 60
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v40

    goto :goto_13

    :cond_13
    move-object/from16 v40, p31

    :goto_13
    const/high16 v41, 0x100000

    and-int v41, v0, v41

    if-eqz v41, :cond_14

    const-wide/16 v41, 0x0

    goto :goto_14

    :cond_14
    move-wide/from16 v41, p32

    :goto_14
    const/high16 v43, 0x200000

    and-int v43, v0, v43

    if-eqz v43, :cond_15

    const-wide/16 v43, 0x0

    goto :goto_15

    :cond_15
    move-wide/from16 v43, p34

    :goto_15
    const/high16 v45, 0x400000

    and-int v45, v0, v45

    if-eqz v45, :cond_16

    const-wide/16 v45, 0x0

    goto :goto_16

    :cond_16
    move-wide/from16 v45, p36

    :goto_16
    const/high16 v47, 0x800000

    and-int v47, v0, v47

    if-eqz v47, :cond_17

    const-wide/16 v47, 0x0

    goto :goto_17

    :cond_17
    move-wide/from16 v47, p38

    :goto_17
    const/high16 v49, 0x1000000

    and-int v49, v0, v49

    if-eqz v49, :cond_18

    const-wide/16 v49, 0x0

    goto :goto_18

    :cond_18
    move-wide/from16 v49, p40

    :goto_18
    const/high16 v51, 0x2000000

    and-int v51, v0, v51

    if-eqz v51, :cond_19

    .line 61
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v51

    goto :goto_19

    :cond_19
    move-object/from16 v51, p42

    :goto_19
    const/high16 v52, 0x4000000

    and-int v52, v0, v52

    if-eqz v52, :cond_1a

    const-wide/16 v52, 0x0

    goto :goto_1a

    :cond_1a
    move-wide/from16 v52, p43

    :goto_1a
    const/high16 v54, 0x8000000

    and-int v54, v0, v54

    if-eqz v54, :cond_1b

    .line 62
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v54

    goto :goto_1b

    :cond_1b
    move-object/from16 v54, p45

    :goto_1b
    const/high16 v55, 0x10000000

    and-int v55, v0, v55

    if-eqz v55, :cond_1c

    const-wide/16 v55, 0x0

    goto :goto_1c

    :cond_1c
    move-wide/from16 v55, p46

    :goto_1c
    const/high16 v57, 0x20000000

    and-int v57, v0, v57

    if-eqz v57, :cond_1d

    .line 63
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v57

    goto :goto_1d

    :cond_1d
    move-object/from16 v57, p48

    :goto_1d
    const/high16 v58, 0x40000000    # 2.0f

    and-int v58, v0, v58

    if-eqz v58, :cond_1e

    .line 64
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v58

    goto :goto_1e

    :cond_1e
    move-object/from16 v58, p49

    :goto_1e
    const/high16 v59, -0x80000000

    and-int v0, v0, v59

    if-eqz v0, :cond_1f

    const-wide/16 v59, 0x0

    goto :goto_1f

    :cond_1f
    move-wide/from16 v59, p50

    :goto_1f
    and-int/lit8 v0, v1, 0x1

    if-eqz v0, :cond_20

    .line 65
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v0

    goto :goto_20

    :cond_20
    move-object/from16 v0, p52

    :goto_20
    and-int/lit8 v61, v1, 0x2

    if-eqz v61, :cond_21

    const-wide/16 v61, 0x0

    goto :goto_21

    :cond_21
    move-wide/from16 v61, p53

    :goto_21
    and-int/lit8 v63, v1, 0x4

    if-eqz v63, :cond_22

    .line 66
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v63

    goto :goto_22

    :cond_22
    move-object/from16 v63, p55

    :goto_22
    and-int/lit8 v64, v1, 0x8

    if-eqz v64, :cond_23

    .line 67
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v64

    goto :goto_23

    :cond_23
    move-object/from16 v64, p56

    :goto_23
    and-int/lit8 v65, v1, 0x10

    if-eqz v65, :cond_24

    const-wide/16 v65, 0x0

    goto :goto_24

    :cond_24
    move-wide/from16 v65, p57

    :goto_24
    and-int/lit8 v67, v1, 0x20

    if-eqz v67, :cond_25

    const-wide/16 v67, 0x0

    goto :goto_25

    :cond_25
    move-wide/from16 v67, p59

    :goto_25
    and-int/lit8 v69, v1, 0x40

    if-eqz v69, :cond_26

    .line 68
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v69

    goto :goto_26

    :cond_26
    move-object/from16 v69, p61

    :goto_26
    and-int/lit16 v3, v1, 0x80

    if-eqz v3, :cond_27

    .line 69
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v3

    goto :goto_27

    :cond_27
    move-object/from16 v3, p62

    :goto_27
    move/from16 p1, v10

    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_28

    .line 70
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v10

    goto :goto_28

    :cond_28
    move-object/from16 v10, p63

    :goto_28
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_29

    const-wide/16 v11, 0x0

    goto :goto_29

    :cond_29
    move-wide/from16 v11, p64

    :goto_29
    move-object/from16 p4, v0

    and-int/lit16 v0, v1, 0x400

    if-eqz v0, :cond_2a

    .line 71
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v0

    goto :goto_2a

    :cond_2a
    move-object/from16 v0, p66

    :goto_2a
    move-object/from16 p5, v0

    and-int/lit16 v0, v1, 0x800

    if-eqz v0, :cond_2b

    const-wide/16 v70, 0x0

    goto :goto_2b

    :cond_2b
    move-wide/from16 v70, p67

    :goto_2b
    and-int/lit16 v0, v1, 0x1000

    if-eqz v0, :cond_2c

    .line 72
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v0

    goto :goto_2c

    :cond_2c
    move-object/from16 v0, p69

    :goto_2c
    move-object/from16 p6, v0

    and-int/lit16 v0, v1, 0x2000

    if-eqz v0, :cond_2d

    const-wide/16 v72, 0x0

    goto :goto_2d

    :cond_2d
    move-wide/from16 v72, p70

    :goto_2d
    and-int/lit16 v0, v1, 0x4000

    if-eqz v0, :cond_2e

    .line 73
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v0

    goto :goto_2e

    :cond_2e
    move-object/from16 v0, p72

    :goto_2e
    and-int v74, v1, p1

    if-eqz v74, :cond_2f

    .line 74
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v74

    goto :goto_2f

    :cond_2f
    move-object/from16 v74, p73

    :goto_2f
    and-int v32, v1, v32

    if-eqz v32, :cond_30

    const-wide/16 v75, 0x0

    goto :goto_30

    :cond_30
    move-wide/from16 v75, p74

    :goto_30
    and-int v32, v1, v34

    if-eqz v32, :cond_31

    .line 75
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v32

    goto :goto_31

    :cond_31
    move-object/from16 v32, p76

    :goto_31
    and-int v34, v1, v36

    if-eqz v34, :cond_32

    const/16 v34, 0x0

    goto :goto_32

    :cond_32
    move/from16 v34, p77

    :goto_32
    and-int v36, v1, v39

    if-eqz v36, :cond_33

    const/16 v36, 0x0

    goto :goto_33

    :cond_33
    move/from16 v36, p78

    :goto_33
    const/high16 v39, 0x100000

    and-int v1, v1, v39

    if-eqz v1, :cond_34

    const/16 p80, 0x0

    :goto_34
    move-object/from16 p1, p0

    move-object/from16 p53, p4

    move-object/from16 p67, p5

    move-object/from16 p70, p6

    move-object/from16 p73, v0

    move/from16 p2, v2

    move-object/from16 p63, v3

    move-wide/from16 p3, v4

    move-object/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move-object/from16 p64, v10

    move-wide/from16 p65, v11

    move-wide/from16 p9, v13

    move-wide/from16 p11, v15

    move-wide/from16 p13, v17

    move-wide/from16 p15, v19

    move-wide/from16 p17, v21

    move-wide/from16 p19, v23

    move-wide/from16 p21, v25

    move-wide/from16 p23, v27

    move-wide/from16 p25, v29

    move-object/from16 p27, v31

    move-object/from16 p77, v32

    move-object/from16 p28, v33

    move/from16 p78, v34

    move-object/from16 p29, v35

    move/from16 p79, v36

    move-wide/from16 p30, v37

    move-object/from16 p32, v40

    move-wide/from16 p33, v41

    move-wide/from16 p35, v43

    move-wide/from16 p37, v45

    move-wide/from16 p39, v47

    move-wide/from16 p41, v49

    move-object/from16 p43, v51

    move-wide/from16 p44, v52

    move-object/from16 p46, v54

    move-wide/from16 p47, v55

    move-object/from16 p49, v57

    move-object/from16 p50, v58

    move-wide/from16 p51, v59

    move-wide/from16 p54, v61

    move-object/from16 p56, v63

    move-object/from16 p57, v64

    move-wide/from16 p58, v65

    move-wide/from16 p60, v67

    move-object/from16 p62, v69

    move-wide/from16 p68, v70

    move-wide/from16 p71, v72

    move-object/from16 p74, v74

    move-wide/from16 p75, v75

    goto :goto_35

    :cond_34
    move/from16 p80, p79

    goto :goto_34

    .line 76
    :goto_35
    invoke-direct/range {p1 .. p80}, Lcom/sma/smartv3/db/entity/Weight;-><init>(IJLjava/lang/String;FIIDDDDDDDDDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DDDDDLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;III)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/Weight;IJLjava/lang/String;FIIDDDDDDDDDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DDDDDLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;IIIIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/Weight;
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p80

    move/from16 v2, p81

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mId:I

    goto :goto_0

    :cond_0
    move/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-wide v4, v0, Lcom/sma/smartv3/db/entity/Weight;->mTime:J

    goto :goto_1

    :cond_1
    move-wide/from16 v4, p2

    :goto_1
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_2

    iget-object v6, v0, Lcom/sma/smartv3/db/entity/Weight;->mLocalTime:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v6, p4

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget v7, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeight:F

    goto :goto_3

    :cond_3
    move/from16 v7, p5

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget v8, v0, Lcom/sma/smartv3/db/entity/Weight;->mIsSync:I

    goto :goto_4

    :cond_4
    move/from16 v8, p6

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget v9, v0, Lcom/sma/smartv3/db/entity/Weight;->mIsMeasure:I

    goto :goto_5

    :cond_5
    move/from16 v9, p7

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget-wide v10, v0, Lcom/sma/smartv3/db/entity/Weight;->mBmi:D

    goto :goto_6

    :cond_6
    move-wide/from16 v10, p8

    :goto_6
    and-int/lit16 v12, v1, 0x80

    if-eqz v12, :cond_7

    iget-wide v12, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFat:D

    goto :goto_7

    :cond_7
    move-wide/from16 v12, p10

    :goto_7
    and-int/lit16 v14, v1, 0x100

    if-eqz v14, :cond_8

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscle:D

    goto :goto_8

    :cond_8
    move-wide/from16 v14, p12

    :goto_8
    move/from16 p1, v3

    and-int/lit16 v3, v1, 0x200

    move-wide/from16 v16, v4

    if-eqz v3, :cond_9

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFat:D

    goto :goto_9

    :cond_9
    move-wide/from16 v3, p14

    :goto_9
    and-int/lit16 v5, v1, 0x400

    move-wide/from16 p2, v3

    if-eqz v5, :cond_a

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProtein:D

    goto :goto_a

    :cond_a
    move-wide/from16 v3, p16

    :goto_a
    and-int/lit16 v5, v1, 0x800

    move-wide/from16 p4, v3

    if-eqz v5, :cond_b

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWater:D

    goto :goto_b

    :cond_b
    move-wide/from16 v3, p18

    :goto_b
    and-int/lit16 v5, v1, 0x1000

    move-wide/from16 p6, v3

    if-eqz v5, :cond_c

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mStateOfNutrition:D

    goto :goto_c

    :cond_c
    move-wide/from16 v3, p20

    :goto_c
    and-int/lit16 v5, v1, 0x2000

    move-wide/from16 p8, v3

    if-eqz v5, :cond_d

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mIdealWeight:D

    goto :goto_d

    :cond_d
    move-wide/from16 v3, p22

    :goto_d
    and-int/lit16 v5, v1, 0x4000

    move-wide/from16 p10, v3

    if-eqz v5, :cond_e

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBody:D

    goto :goto_e

    :cond_e
    move-wide/from16 v3, p24

    :goto_e
    const v5, 0x8000

    and-int v18, v1, v5

    move/from16 p12, v5

    if-eqz v18, :cond_f

    iget-object v5, v0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBodyRange:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v5, p26

    :goto_f
    const/high16 v18, 0x10000

    and-int v19, v1, v18

    if-eqz v19, :cond_10

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mBmiRange:Ljava/util/List;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p27

    :goto_10
    const/high16 v19, 0x20000

    and-int v20, p80, v19

    move-object/from16 p13, v1

    if-eqz v20, :cond_11

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mBmiWHORange:Ljava/util/List;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p28

    :goto_11
    const/high16 v20, 0x40000

    and-int v21, p80, v20

    move-wide/from16 p14, v3

    if-eqz v21, :cond_12

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mBmr:D

    goto :goto_12

    :cond_12
    move-wide/from16 v3, p29

    :goto_12
    const/high16 v21, 0x80000

    and-int v22, p80, v21

    move-object/from16 p16, v1

    if-eqz v22, :cond_13

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mBmrRange:Ljava/util/List;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p31

    :goto_13
    const/high16 v22, 0x100000

    and-int v23, p80, v22

    move-wide/from16 p17, v3

    if-eqz v23, :cond_14

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mBodyShape:D

    goto :goto_14

    :cond_14
    move-wide/from16 v3, p32

    :goto_14
    const/high16 v23, 0x200000

    and-int v23, p80, v23

    move-wide/from16 p19, v3

    if-eqz v23, :cond_15

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mDesirableWeight:D

    goto :goto_15

    :cond_15
    move-wide/from16 v3, p34

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, p80, v23

    move-wide/from16 p21, v3

    if-eqz v23, :cond_16

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mFatFreeBodyWeight:D

    goto :goto_16

    :cond_16
    move-wide/from16 v3, p36

    :goto_16
    const/high16 v23, 0x800000

    and-int v23, p80, v23

    move-wide/from16 p23, v3

    if-eqz v23, :cond_17

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mFatToControl:D

    goto :goto_17

    :cond_17
    move-wide/from16 v3, p38

    :goto_17
    const/high16 v23, 0x1000000

    and-int v23, p80, v23

    move-wide/from16 p25, v3

    if-eqz v23, :cond_18

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFat:D

    goto :goto_18

    :cond_18
    move-wide/from16 v3, p40

    :goto_18
    const/high16 v23, 0x2000000

    and-int v23, p80, v23

    move-object/from16 p27, v1

    if-eqz v23, :cond_19

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFatRange:Ljava/util/List;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p42

    :goto_19
    const/high16 v23, 0x4000000

    and-int v23, p80, v23

    move-wide/from16 p28, v3

    if-eqz v23, :cond_1a

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mMuscleToControl:D

    goto :goto_1a

    :cond_1a
    move-wide/from16 v3, p43

    :goto_1a
    const/high16 v23, 0x8000000

    and-int v23, p80, v23

    move-object/from16 p30, v1

    if-eqz v23, :cond_1b

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFatRange:Ljava/util/List;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p45

    :goto_1b
    const/high16 v23, 0x10000000

    and-int v23, p80, v23

    move-wide/from16 p31, v3

    if-eqz v23, :cond_1c

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscle:D

    goto :goto_1c

    :cond_1c
    move-wide/from16 v3, p46

    :goto_1c
    const/high16 v23, 0x20000000

    and-int v23, p80, v23

    move-object/from16 p33, v1

    if-eqz v23, :cond_1d

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscleRange:Ljava/util/List;

    goto :goto_1d

    :cond_1d
    move-object/from16 v1, p48

    :goto_1d
    const/high16 v23, 0x40000000    # 2.0f

    and-int v23, p80, v23

    move-object/from16 p34, v1

    if-eqz v23, :cond_1e

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinRange:Ljava/util/List;

    goto :goto_1e

    :cond_1e
    move-object/from16 v1, p49

    :goto_1e
    const/high16 v23, -0x80000000

    and-int v23, p80, v23

    move-wide/from16 p35, v3

    if-eqz v23, :cond_1f

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscle:D

    goto :goto_1f

    :cond_1f
    move-wide/from16 v3, p50

    :goto_1f
    and-int/lit8 v23, v2, 0x1

    move-object/from16 p37, v1

    if-eqz v23, :cond_20

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscleRange:Ljava/util/List;

    goto :goto_20

    :cond_20
    move-object/from16 v1, p52

    :goto_20
    and-int/lit8 v23, v2, 0x2

    move-wide/from16 p38, v3

    if-eqz v23, :cond_21

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFat:D

    goto :goto_21

    :cond_21
    move-wide/from16 v3, p53

    :goto_21
    and-int/lit8 v23, v2, 0x4

    move-object/from16 p40, v1

    if-eqz v23, :cond_22

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFatRange:Ljava/util/List;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p55

    :goto_22
    and-int/lit8 v23, v2, 0x8

    move-object/from16 p41, v1

    if-eqz v23, :cond_23

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterRange:Ljava/util/List;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p56

    :goto_23
    and-int/lit8 v23, v2, 0x10

    move-wide/from16 p42, v3

    if-eqz v23, :cond_24

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mScore:D

    goto :goto_24

    :cond_24
    move-wide/from16 v3, p57

    :goto_24
    and-int/lit8 v23, v2, 0x20

    move-wide/from16 p44, v3

    if-eqz v23, :cond_25

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBone:D

    goto :goto_25

    :cond_25
    move-wide/from16 v3, p59

    :goto_25
    and-int/lit8 v23, v2, 0x40

    move-object/from16 p46, v1

    if-eqz v23, :cond_26

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBoneRange:Ljava/util/List;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p61

    :goto_26
    move-object/from16 p47, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFatRange:Ljava/util/List;

    goto :goto_27

    :cond_27
    move-object/from16 v1, p62

    :goto_27
    move-object/from16 p48, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscleRange:Ljava/util/List;

    goto :goto_28

    :cond_28
    move-object/from16 v1, p63

    :goto_28
    move-object/from16 p49, v1

    and-int/lit16 v1, v2, 0x200

    move-wide/from16 p50, v3

    if-eqz v1, :cond_29

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProtein:D

    goto :goto_29

    :cond_29
    move-wide/from16 v3, p64

    :goto_29
    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProteinRange:Ljava/util/List;

    goto :goto_2a

    :cond_2a
    move-object/from16 v1, p66

    :goto_2a
    move-object/from16 p52, v1

    and-int/lit16 v1, v2, 0x800

    move-wide/from16 p53, v3

    if-eqz v1, :cond_2b

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscle:D

    goto :goto_2b

    :cond_2b
    move-wide/from16 v3, p67

    :goto_2b
    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscleRange:Ljava/util/List;

    goto :goto_2c

    :cond_2c
    move-object/from16 v1, p69

    :goto_2c
    move-object/from16 p55, v1

    and-int/lit16 v1, v2, 0x2000

    move-wide/from16 p56, v3

    if-eqz v1, :cond_2d

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWater:D

    goto :goto_2d

    :cond_2d
    move-wide/from16 v3, p70

    :goto_2d
    and-int/lit16 v1, v2, 0x4000

    if-eqz v1, :cond_2e

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWaterRange:Ljava/util/List;

    goto :goto_2e

    :cond_2e
    move-object/from16 v1, p72

    :goto_2e
    and-int v23, v2, p12

    move-object/from16 p12, v1

    if-eqz v23, :cond_2f

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightRange:Ljava/util/List;

    goto :goto_2f

    :cond_2f
    move-object/from16 v1, p73

    :goto_2f
    and-int v18, v2, v18

    move-object/from16 p58, v1

    if-eqz v18, :cond_30

    iget-wide v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightToControl:D

    goto :goto_30

    :cond_30
    move-wide/from16 v1, p74

    :goto_30
    and-int v18, p81, v19

    move-wide/from16 p59, v1

    if-eqz v18, :cond_31

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightWHORange:Ljava/util/List;

    goto :goto_31

    :cond_31
    move-object/from16 v1, p76

    :goto_31
    and-int v2, p81, v20

    if-eqz v2, :cond_32

    iget v2, v0, Lcom/sma/smartv3/db/entity/Weight;->mIsDelete:I

    goto :goto_32

    :cond_32
    move/from16 v2, p77

    :goto_32
    and-int v18, p81, v21

    move-object/from16 p61, v1

    if-eqz v18, :cond_33

    iget v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinLevel:I

    goto :goto_33

    :cond_33
    move/from16 v1, p78

    :goto_33
    and-int v18, p81, v22

    if-eqz v18, :cond_34

    move/from16 p62, v1

    iget v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterLevel:I

    move/from16 p79, p62

    move/from16 p80, v1

    move-object/from16 p73, p12

    move-object/from16 p63, p48

    move-object/from16 p64, p49

    move-object/from16 p67, p52

    move-wide/from16 p65, p53

    move-object/from16 p70, p55

    move-wide/from16 p68, p56

    move-object/from16 p74, p58

    move-wide/from16 p75, p59

    move-object/from16 p77, p61

    move/from16 p78, v2

    move-wide/from16 p71, v3

    move-object/from16 p49, p34

    move-object/from16 p53, p40

    move-object/from16 p56, p41

    move-wide/from16 p54, p42

    move-wide/from16 p58, p44

    move-object/from16 p57, p46

    move-object/from16 p62, p47

    move-wide/from16 p60, p50

    move-wide/from16 p41, p28

    move-object/from16 p43, p30

    move-wide/from16 p44, p31

    move-object/from16 p46, p33

    move-wide/from16 p47, p35

    move-object/from16 p50, p37

    move-wide/from16 p51, p38

    move-object/from16 p28, p13

    move-object/from16 p29, p16

    move-wide/from16 p30, p17

    move-wide/from16 p33, p19

    move-wide/from16 p35, p21

    move-wide/from16 p37, p23

    move-wide/from16 p39, p25

    move-object/from16 p32, p27

    move-object/from16 p27, v5

    move-wide/from16 p17, p4

    move-wide/from16 p19, p6

    move-wide/from16 p21, p8

    move-wide/from16 p23, p10

    move-wide/from16 p25, p14

    move-object/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    :goto_34
    move-wide/from16 p9, v10

    move-wide/from16 p11, v12

    move-wide/from16 p13, v14

    move-wide/from16 p15, p2

    move-wide/from16 p3, v16

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto/16 :goto_35

    :cond_34
    move/from16 p80, p79

    move/from16 p79, v1

    move-object/from16 p73, p12

    move-object/from16 p62, p47

    move-object/from16 p63, p48

    move-object/from16 p64, p49

    move-object/from16 p67, p52

    move-wide/from16 p65, p53

    move-object/from16 p70, p55

    move-wide/from16 p68, p56

    move-object/from16 p74, p58

    move-wide/from16 p75, p59

    move-object/from16 p77, p61

    move/from16 p78, v2

    move-wide/from16 p71, v3

    move-object/from16 p49, p34

    move-wide/from16 p47, p35

    move-object/from16 p53, p40

    move-object/from16 p56, p41

    move-wide/from16 p54, p42

    move-wide/from16 p58, p44

    move-object/from16 p57, p46

    move-wide/from16 p60, p50

    move-wide/from16 p35, p21

    move-wide/from16 p41, p28

    move-object/from16 p43, p30

    move-wide/from16 p44, p31

    move-object/from16 p46, p33

    move-object/from16 p50, p37

    move-wide/from16 p51, p38

    move-wide/from16 p21, p8

    move-object/from16 p28, p13

    move-object/from16 p29, p16

    move-wide/from16 p30, p17

    move-wide/from16 p33, p19

    move-wide/from16 p37, p23

    move-wide/from16 p39, p25

    move-object/from16 p32, p27

    move-object/from16 p27, v5

    move/from16 p8, v9

    move-wide/from16 p17, p4

    move-wide/from16 p19, p6

    move-wide/from16 p23, p10

    move-wide/from16 p25, p14

    move-object/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    goto :goto_34

    :goto_35
    invoke-virtual/range {p1 .. p80}, Lcom/sma/smartv3/db/entity/Weight;->copy(IJLjava/lang/String;FIIDDDDDDDDDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DDDDDLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;III)Lcom/sma/smartv3/db/entity/Weight;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mId:I

    return v0
.end method

.method public final component10()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFat:D

    return-wide v0
.end method

.method public final component11()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProtein:D

    return-wide v0
.end method

.method public final component12()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWater:D

    return-wide v0
.end method

.method public final component13()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mStateOfNutrition:D

    return-wide v0
.end method

.method public final component14()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mIdealWeight:D

    return-wide v0
.end method

.method public final component15()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBody:D

    return-wide v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBodyRange:Ljava/util/List;

    return-object v0
.end method

.method public final component17()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmiRange:Ljava/util/List;

    return-object v0
.end method

.method public final component18()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmiWHORange:Ljava/util/List;

    return-object v0
.end method

.method public final component19()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmr:D

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mTime:J

    return-wide v0
.end method

.method public final component20()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmrRange:Ljava/util/List;

    return-object v0
.end method

.method public final component21()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBodyShape:D

    return-wide v0
.end method

.method public final component22()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mDesirableWeight:D

    return-wide v0
.end method

.method public final component23()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mFatFreeBodyWeight:D

    return-wide v0
.end method

.method public final component24()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mFatToControl:D

    return-wide v0
.end method

.method public final component25()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFat:D

    return-wide v0
.end method

.method public final component26()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFatRange:Ljava/util/List;

    return-object v0
.end method

.method public final component27()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mMuscleToControl:D

    return-wide v0
.end method

.method public final component28()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFatRange:Ljava/util/List;

    return-object v0
.end method

.method public final component29()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscle:D

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscleRange:Ljava/util/List;

    return-object v0
.end method

.method public final component31()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinRange:Ljava/util/List;

    return-object v0
.end method

.method public final component32()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscle:D

    return-wide v0
.end method

.method public final component33()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscleRange:Ljava/util/List;

    return-object v0
.end method

.method public final component34()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFat:D

    return-wide v0
.end method

.method public final component35()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFatRange:Ljava/util/List;

    return-object v0
.end method

.method public final component36()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterRange:Ljava/util/List;

    return-object v0
.end method

.method public final component37()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mScore:D

    return-wide v0
.end method

.method public final component38()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBone:D

    return-wide v0
.end method

.method public final component39()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBoneRange:Ljava/util/List;

    return-object v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeight:F

    return v0
.end method

.method public final component40()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFatRange:Ljava/util/List;

    return-object v0
.end method

.method public final component41()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscleRange:Ljava/util/List;

    return-object v0
.end method

.method public final component42()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProtein:D

    return-wide v0
.end method

.method public final component43()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProteinRange:Ljava/util/List;

    return-object v0
.end method

.method public final component44()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscle:D

    return-wide v0
.end method

.method public final component45()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscleRange:Ljava/util/List;

    return-object v0
.end method

.method public final component46()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWater:D

    return-wide v0
.end method

.method public final component47()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWaterRange:Ljava/util/List;

    return-object v0
.end method

.method public final component48()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightRange:Ljava/util/List;

    return-object v0
.end method

.method public final component49()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightToControl:D

    return-wide v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsSync:I

    return v0
.end method

.method public final component50()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightWHORange:Ljava/util/List;

    return-object v0
.end method

.method public final component51()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsDelete:I

    return v0
.end method

.method public final component52()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinLevel:I

    return v0
.end method

.method public final component53()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterLevel:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsMeasure:I

    return v0
.end method

.method public final component7()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmi:D

    return-wide v0
.end method

.method public final component8()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFat:D

    return-wide v0
.end method

.method public final component9()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscle:D

    return-wide v0
.end method

.method public final copy(IJLjava/lang/String;FIIDDDDDDDDDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DDDDDLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;III)Lcom/sma/smartv3/db/entity/Weight;
    .locals 81
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p26    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p27    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p28    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p31    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p42    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p45    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p48    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p49    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p52    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p55    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p56    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p61    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p62    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p63    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p66    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p69    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p72    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p73    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p76    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Ljava/lang/String;",
            "FIIDDDDDDDDD",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;DDDDD",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;DD",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;III)",
            "Lcom/sma/smartv3/db/entity/Weight;"
        }
    .end annotation

    const-string v0, "mLocalTime"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAgeOfBodyRange"

    move-object/from16 v1, p26

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBmiRange"

    move-object/from16 v2, p27

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBmiWHORange"

    move-object/from16 v3, p28

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBmrRange"

    move-object/from16 v4, p31

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLevelOfVisceralFatRange"

    move-object/from16 v6, p42

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRatioOfFatRange"

    move-object/from16 v7, p45

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRatioOfMuscleRange"

    move-object/from16 v8, p48

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRatioOfProteinRange"

    move-object/from16 v9, p49

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRatioOfSkeletalMuscleRange"

    move-object/from16 v10, p52

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRatioOfSubcutaneousFatRange"

    move-object/from16 v11, p55

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRatioOfWaterRange"

    move-object/from16 v12, p56

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightOfBoneRange"

    move-object/from16 v13, p61

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightOfFatRange"

    move-object/from16 v14, p62

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightOfMuscleRange"

    move-object/from16 v15, p63

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightOfProteinRange"

    move-object/from16 v1, p66

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightOfSkeletalMuscleRange"

    move-object/from16 v1, p69

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightOfWaterRange"

    move-object/from16 v1, p72

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightRange"

    move-object/from16 v1, p73

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightWHORange"

    move-object/from16 v1, p76

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/Weight;

    move-wide/from16 v17, p16

    move-wide/from16 v19, p18

    move-wide/from16 v21, p20

    move-wide/from16 v23, p22

    move-wide/from16 v25, p24

    move-object/from16 v27, p26

    move-wide/from16 v30, p29

    move-wide/from16 v33, p32

    move-wide/from16 v35, p34

    move-wide/from16 v37, p36

    move-wide/from16 v39, p38

    move-wide/from16 v41, p40

    move-wide/from16 v44, p43

    move-wide/from16 v47, p46

    move-wide/from16 v51, p50

    move-wide/from16 v54, p53

    move-wide/from16 v58, p57

    move-wide/from16 v60, p59

    move-wide/from16 v65, p64

    move-object/from16 v67, p66

    move-wide/from16 v68, p67

    move-object/from16 v70, p69

    move-wide/from16 v71, p70

    move-object/from16 v73, p72

    move-object/from16 v74, p73

    move-wide/from16 v75, p74

    move-object/from16 v77, p76

    move/from16 v78, p77

    move/from16 v79, p78

    move/from16 v80, p79

    move-object/from16 v28, v2

    move-object/from16 v29, v3

    move-object/from16 v32, v4

    move-object/from16 v43, v6

    move-object/from16 v46, v7

    move-object/from16 v49, v8

    move-object/from16 v50, v9

    move-object/from16 v53, v10

    move-object/from16 v56, v11

    move-object/from16 v57, v12

    move-object/from16 v62, v13

    move-object/from16 v63, v14

    move-object/from16 v64, v15

    move/from16 v2, p1

    move-wide/from16 v3, p2

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-wide/from16 v9, p8

    move-wide/from16 v11, p10

    move-wide/from16 v13, p12

    move-wide/from16 v15, p14

    invoke-direct/range {v1 .. v80}, Lcom/sma/smartv3/db/entity/Weight;-><init>(IJLjava/lang/String;FIIDDDDDDDDDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DDDDDLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;III)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/Weight;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/Weight;

    iget v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mId:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mLocalTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mLocalTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeight:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeight:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsSync:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mIsSync:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsMeasure:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mIsMeasure:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmi:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mBmi:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFat:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFat:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscle:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscle:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFat:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFat:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProtein:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProtein:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWater:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWater:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_d

    return v2

    :cond_d
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mStateOfNutrition:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mStateOfNutrition:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_e

    return v2

    :cond_e
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mIdealWeight:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mIdealWeight:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBody:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBody:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBodyRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBodyRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmiRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mBmiRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmiWHORange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mBmiWHORange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmr:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mBmr:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmrRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mBmrRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mBodyShape:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mBodyShape:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_16

    return v2

    :cond_16
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mDesirableWeight:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mDesirableWeight:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_17

    return v2

    :cond_17
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mFatFreeBodyWeight:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mFatFreeBodyWeight:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_18

    return v2

    :cond_18
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mFatToControl:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mFatToControl:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_19

    return v2

    :cond_19
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFat:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFat:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFatRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFatRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mMuscleToControl:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mMuscleToControl:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFatRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFatRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscle:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscle:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscleRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscleRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscle:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscle:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_21

    return v2

    :cond_21
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscleRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscleRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFat:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFat:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFatRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFatRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mScore:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mScore:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_26

    return v2

    :cond_26
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBone:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBone:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBoneRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBoneRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFatRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFatRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscleRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscleRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    :cond_2a
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProtein:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProtein:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2b

    return v2

    :cond_2b
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProteinRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProteinRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    return v2

    :cond_2c
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscle:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscle:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2d

    return v2

    :cond_2d
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscleRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscleRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    return v2

    :cond_2e
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWater:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWater:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2f

    return v2

    :cond_2f
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWaterRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWaterRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    return v2

    :cond_30
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightRange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeightRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    return v2

    :cond_31
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightToControl:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeightToControl:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_32

    return v2

    :cond_32
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightWHORange:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mWeightWHORange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    return v2

    :cond_33
    iget v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsDelete:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mIsDelete:I

    if-eq v1, v3, :cond_34

    return v2

    :cond_34
    iget v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinLevel:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinLevel:I

    if-eq v1, v3, :cond_35

    return v2

    :cond_35
    iget v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterLevel:I

    iget p1, p1, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterLevel:I

    if-eq v1, p1, :cond_36

    return v2

    :cond_36
    return v0
.end method

.method public final getMAgeOfBody()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBody:D

    return-wide v0
.end method

.method public final getMAgeOfBodyRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBodyRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMBmi()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmi:D

    return-wide v0
.end method

.method public final getMBmiRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmiRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMBmiWHORange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmiWHORange:Ljava/util/List;

    return-object v0
.end method

.method public final getMBmr()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmr:D

    return-wide v0
.end method

.method public final getMBmrRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmrRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMBodyShape()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBodyShape:D

    return-wide v0
.end method

.method public final getMDesirableWeight()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mDesirableWeight:D

    return-wide v0
.end method

.method public final getMFatFreeBodyWeight()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mFatFreeBodyWeight:D

    return-wide v0
.end method

.method public final getMFatToControl()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mFatToControl:D

    return-wide v0
.end method

.method public final getMId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mId:I

    return v0
.end method

.method public final getMIdealWeight()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mIdealWeight:D

    return-wide v0
.end method

.method public final getMIsDelete()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsDelete:I

    return v0
.end method

.method public final getMIsMeasure()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsMeasure:I

    return v0
.end method

.method public final getMIsSync()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsSync:I

    return v0
.end method

.method public final getMLevelOfVisceralFat()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFat:D

    return-wide v0
.end method

.method public final getMLevelOfVisceralFatRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFatRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMLocalTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMMuscleToControl()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mMuscleToControl:D

    return-wide v0
.end method

.method public final getMRatioOfFat()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFat:D

    return-wide v0
.end method

.method public final getMRatioOfFatRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFatRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMRatioOfMuscle()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscle:D

    return-wide v0
.end method

.method public final getMRatioOfMuscleRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscleRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMRatioOfProtein()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProtein:D

    return-wide v0
.end method

.method public final getMRatioOfProteinLevel()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinLevel:I

    return v0
.end method

.method public final getMRatioOfProteinRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMRatioOfSkeletalMuscle()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscle:D

    return-wide v0
.end method

.method public final getMRatioOfSkeletalMuscleRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscleRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMRatioOfSubcutaneousFat()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFat:D

    return-wide v0
.end method

.method public final getMRatioOfSubcutaneousFatRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFatRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMRatioOfWater()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWater:D

    return-wide v0
.end method

.method public final getMRatioOfWaterLevel()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterLevel:I

    return v0
.end method

.method public final getMRatioOfWaterRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMScore()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mScore:D

    return-wide v0
.end method

.method public final getMStateOfNutrition()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mStateOfNutrition:D

    return-wide v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mTime:J

    return-wide v0
.end method

.method public final getMWeight()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeight:F

    return v0
.end method

.method public final getMWeightOfBone()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBone:D

    return-wide v0
.end method

.method public final getMWeightOfBoneRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBoneRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMWeightOfFat()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFat:D

    return-wide v0
.end method

.method public final getMWeightOfFatRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFatRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMWeightOfMuscle()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscle:D

    return-wide v0
.end method

.method public final getMWeightOfMuscleRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscleRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMWeightOfProtein()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProtein:D

    return-wide v0
.end method

.method public final getMWeightOfProteinRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProteinRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMWeightOfSkeletalMuscle()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscle:D

    return-wide v0
.end method

.method public final getMWeightOfSkeletalMuscleRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscleRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMWeightOfWater()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWater:D

    return-wide v0
.end method

.method public final getMWeightOfWaterRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWaterRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMWeightRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightRange:Ljava/util/List;

    return-object v0
.end method

.method public final getMWeightToControl()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightToControl:D

    return-wide v0
.end method

.method public final getMWeightWHORange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightWHORange:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mLocalTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeight:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsSync:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsMeasure:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmi:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFat:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscle:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFat:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProtein:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWater:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mStateOfNutrition:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mIdealWeight:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBody:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBodyRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmiRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmiWHORange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmr:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmrRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mBodyShape:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mDesirableWeight:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mFatFreeBodyWeight:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mFatToControl:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFat:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFatRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mMuscleToControl:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFatRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscle:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscleRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscle:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscleRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFat:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFatRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mScore:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBone:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBoneRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFatRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscleRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProtein:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProteinRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscle:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscleRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWater:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWaterRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightRange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightToControl:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightWHORange:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsDelete:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinLevel:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterLevel:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setBodyFatScale(Lcom/android/mltcode/paycertificationapi/X01O1XO0i;)V
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/X01O1XO0i;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bodyFatScale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mTime:J

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XO0O10()Ljava/text/SimpleDateFormat;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "millis2String(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mLocalTime:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->iiII()D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeight:F

    const/4 v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsMeasure:I

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->XO0X10iO()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmi:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->IX1XiI()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFat:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->iOX()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscle:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->O101()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFat:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->Xi1i0XOX0()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProtein:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->iIi1()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWater:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->X1OI()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mStateOfNutrition:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->XOXiX0()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mIdealWeight:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->i0X000X0O()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBody:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->i11I()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBodyRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->Ii0X0X()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmiRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->XXiIiX10()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmiWHORange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->X00Xi1X()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmr:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->X1()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmrRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->IXOIIIO()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mBodyShape:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->IO0II0i()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mDesirableWeight:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->IXI()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mFatFreeBodyWeight:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->IiiXiI0I()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mFatToControl:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->XOO0XOOii()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFat:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->iiIOiX()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFatRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->Oi()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mMuscleToControl:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->XXiO0i()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFatRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->iXi()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscle:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->O0O()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscleRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->iii0()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->Xii11I()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscle:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->X0iO()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscleRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->X00O0()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFat:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->X111IO()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFatRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->i100IXOX()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->iI0I()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mScore:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->I0()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBone:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->iIi0()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBoneRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->IXiOXO()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFatRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->XXI0XOIX()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscleRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->XIIO11I()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProtein:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->XXOXi()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProteinRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->I0XXi0X()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscle:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->IOi1O0()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscleRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->O1()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWater:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->O1iXiI()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWaterRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->IX0iIX()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightRange:Ljava/util/List;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->OXi001()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightToControl:D

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/XXX1OX1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/XXX1OX1;->I0IIOI()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightWHORange:Ljava/util/List;

    return-void
.end method

.method public final setMAgeOfBody(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBody:D

    return-void
.end method

.method public final setMAgeOfBodyRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBodyRange:Ljava/util/List;

    return-void
.end method

.method public final setMBmi(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmi:D

    return-void
.end method

.method public final setMBmiRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmiRange:Ljava/util/List;

    return-void
.end method

.method public final setMBmiWHORange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmiWHORange:Ljava/util/List;

    return-void
.end method

.method public final setMBmr(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmr:D

    return-void
.end method

.method public final setMBmrRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mBmrRange:Ljava/util/List;

    return-void
.end method

.method public final setMBodyShape(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mBodyShape:D

    return-void
.end method

.method public final setMDesirableWeight(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mDesirableWeight:D

    return-void
.end method

.method public final setMFatFreeBodyWeight(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mFatFreeBodyWeight:D

    return-void
.end method

.method public final setMFatToControl(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mFatToControl:D

    return-void
.end method

.method public final setMIdealWeight(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mIdealWeight:D

    return-void
.end method

.method public final setMIsDelete(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsDelete:I

    return-void
.end method

.method public final setMIsMeasure(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsMeasure:I

    return-void
.end method

.method public final setMIsSync(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mIsSync:I

    return-void
.end method

.method public final setMLevelOfVisceralFat(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFat:D

    return-void
.end method

.method public final setMLevelOfVisceralFatRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFatRange:Ljava/util/List;

    return-void
.end method

.method public final setMLocalTime(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mLocalTime:Ljava/lang/String;

    return-void
.end method

.method public final setMMuscleToControl(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mMuscleToControl:D

    return-void
.end method

.method public final setMRatioOfFat(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFat:D

    return-void
.end method

.method public final setMRatioOfFatRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFatRange:Ljava/util/List;

    return-void
.end method

.method public final setMRatioOfMuscle(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscle:D

    return-void
.end method

.method public final setMRatioOfMuscleRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscleRange:Ljava/util/List;

    return-void
.end method

.method public final setMRatioOfProtein(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProtein:D

    return-void
.end method

.method public final setMRatioOfProteinLevel(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinLevel:I

    return-void
.end method

.method public final setMRatioOfProteinRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinRange:Ljava/util/List;

    return-void
.end method

.method public final setMRatioOfSkeletalMuscle(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscle:D

    return-void
.end method

.method public final setMRatioOfSkeletalMuscleRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscleRange:Ljava/util/List;

    return-void
.end method

.method public final setMRatioOfSubcutaneousFat(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFat:D

    return-void
.end method

.method public final setMRatioOfSubcutaneousFatRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFatRange:Ljava/util/List;

    return-void
.end method

.method public final setMRatioOfWater(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWater:D

    return-void
.end method

.method public final setMRatioOfWaterLevel(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterLevel:I

    return-void
.end method

.method public final setMRatioOfWaterRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterRange:Ljava/util/List;

    return-void
.end method

.method public final setMScore(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mScore:D

    return-void
.end method

.method public final setMStateOfNutrition(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mStateOfNutrition:D

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mTime:J

    return-void
.end method

.method public final setMWeight(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeight:F

    return-void
.end method

.method public final setMWeightOfBone(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBone:D

    return-void
.end method

.method public final setMWeightOfBoneRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBoneRange:Ljava/util/List;

    return-void
.end method

.method public final setMWeightOfFat(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFat:D

    return-void
.end method

.method public final setMWeightOfFatRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFatRange:Ljava/util/List;

    return-void
.end method

.method public final setMWeightOfMuscle(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscle:D

    return-void
.end method

.method public final setMWeightOfMuscleRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscleRange:Ljava/util/List;

    return-void
.end method

.method public final setMWeightOfProtein(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProtein:D

    return-void
.end method

.method public final setMWeightOfProteinRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProteinRange:Ljava/util/List;

    return-void
.end method

.method public final setMWeightOfSkeletalMuscle(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscle:D

    return-void
.end method

.method public final setMWeightOfSkeletalMuscleRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscleRange:Ljava/util/List;

    return-void
.end method

.method public final setMWeightOfWater(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWater:D

    return-void
.end method

.method public final setMWeightOfWaterRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWaterRange:Ljava/util/List;

    return-void
.end method

.method public final setMWeightRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightRange:Ljava/util/List;

    return-void
.end method

.method public final setMWeightToControl(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightToControl:D

    return-void
.end method

.method public final setMWeightWHORange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Weight;->mWeightWHORange:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 81
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget v1, v0, Lcom/sma/smartv3/db/entity/Weight;->mId:I

    iget-wide v2, v0, Lcom/sma/smartv3/db/entity/Weight;->mTime:J

    iget-object v4, v0, Lcom/sma/smartv3/db/entity/Weight;->mLocalTime:Ljava/lang/String;

    iget v5, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeight:F

    iget v6, v0, Lcom/sma/smartv3/db/entity/Weight;->mIsSync:I

    iget v7, v0, Lcom/sma/smartv3/db/entity/Weight;->mIsMeasure:I

    iget-wide v8, v0, Lcom/sma/smartv3/db/entity/Weight;->mBmi:D

    iget-wide v10, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFat:D

    iget-wide v12, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscle:D

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFat:D

    move-wide/from16 v16, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProtein:D

    move-wide/from16 v18, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWater:D

    move-wide/from16 v20, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mStateOfNutrition:D

    move-wide/from16 v22, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mIdealWeight:D

    move-wide/from16 v24, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBody:D

    move-wide/from16 v26, v14

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mAgeOfBodyRange:Ljava/util/List;

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mBmiRange:Ljava/util/List;

    move-object/from16 v28, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mBmiWHORange:Ljava/util/List;

    move-object/from16 v29, v14

    move-object/from16 v30, v15

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mBmr:D

    move-wide/from16 v31, v14

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mBmrRange:Ljava/util/List;

    move-object/from16 v33, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mBodyShape:D

    move-wide/from16 v34, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mDesirableWeight:D

    move-wide/from16 v36, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mFatFreeBodyWeight:D

    move-wide/from16 v38, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mFatToControl:D

    move-wide/from16 v40, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFat:D

    move-wide/from16 v42, v14

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mLevelOfVisceralFatRange:Ljava/util/List;

    move-object/from16 v44, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mMuscleToControl:D

    move-wide/from16 v45, v14

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfFatRange:Ljava/util/List;

    move-object/from16 v47, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscle:D

    move-wide/from16 v48, v14

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfMuscleRange:Ljava/util/List;

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinRange:Ljava/util/List;

    move-object/from16 v50, v14

    move-object/from16 v51, v15

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscle:D

    move-wide/from16 v52, v14

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSkeletalMuscleRange:Ljava/util/List;

    move-object/from16 v54, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFat:D

    move-wide/from16 v55, v14

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfSubcutaneousFatRange:Ljava/util/List;

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterRange:Ljava/util/List;

    move-object/from16 v57, v14

    move-object/from16 v58, v15

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mScore:D

    move-wide/from16 v59, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBone:D

    move-wide/from16 v61, v14

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfBoneRange:Ljava/util/List;

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfFatRange:Ljava/util/List;

    move-object/from16 v63, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfMuscleRange:Ljava/util/List;

    move-object/from16 v64, v14

    move-object/from16 v65, v15

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProtein:D

    move-wide/from16 v66, v14

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfProteinRange:Ljava/util/List;

    move-object/from16 v68, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscle:D

    move-wide/from16 v69, v14

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfSkeletalMuscleRange:Ljava/util/List;

    move-object/from16 v71, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWater:D

    move-wide/from16 v72, v14

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightOfWaterRange:Ljava/util/List;

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightRange:Ljava/util/List;

    move-object/from16 v74, v14

    move-object/from16 v75, v15

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightToControl:D

    move-wide/from16 v76, v14

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/Weight;->mWeightWHORange:Ljava/util/List;

    iget v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mIsDelete:I

    move/from16 v78, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfProteinLevel:I

    move/from16 v79, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Weight;->mRatioOfWaterLevel:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v80, v15

    const-string v15, "Weight(mId="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mLocalTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mIsSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsMeasure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBmi="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mRatioOfFat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightOfMuscle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightOfFat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v16

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mRatioOfProtein="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v18

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mRatioOfWater="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v20

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mStateOfNutrition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v22

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mIdealWeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v24

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mAgeOfBody="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v26

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mAgeOfBodyRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mBmiRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mBmiWHORange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mBmr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v31

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mBmrRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mBodyShape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v34

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mDesirableWeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v36

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mFatFreeBodyWeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v38

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mFatToControl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v40

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mLevelOfVisceralFat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v42

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mLevelOfVisceralFatRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v44

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mMuscleToControl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v45

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mRatioOfFatRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v47

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mRatioOfMuscle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v48

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mRatioOfMuscleRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v50

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mRatioOfProteinRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v51

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mRatioOfSkeletalMuscle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v52

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mRatioOfSkeletalMuscleRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v54

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mRatioOfSubcutaneousFat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v55

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mRatioOfSubcutaneousFatRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v57

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mRatioOfWaterRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v58

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v59

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightOfBone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v61

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightOfBoneRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v64

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightOfFatRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v63

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightOfMuscleRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v65

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightOfProtein="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v66

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightOfProteinRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v68

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightOfSkeletalMuscle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v69

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightOfSkeletalMuscleRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v71

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightOfWater="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v72

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightOfWaterRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v74

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v75

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightToControl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v76

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightWHORange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mIsDelete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v78

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRatioOfProteinLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v79

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRatioOfWaterLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v80

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
