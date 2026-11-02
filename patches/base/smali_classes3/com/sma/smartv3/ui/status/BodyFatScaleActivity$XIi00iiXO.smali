.class public final Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;
.super Lcom/vtrump/vtble/XO0O10$O00;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;

    invoke-direct {p0}, Lcom/vtrump/vtble/XO0O10$O00;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 86

    move-object/from16 v1, p0

    invoke-super/range {p0 .. p1}, Lcom/vtrump/vtble/XO0O10$O00;->OXO1(Ljava/lang/String;)V

    const-class v0, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->IiI10X()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "bodyFatScale.code = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->IiI10X()I

    move-result v2

    const/16 v3, 0xc8

    if-ne v2, v3, :cond_2

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v0, "age"

    iget-object v3, v1, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;

    invoke-static {v3}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->access$getAppUser$p(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Lcom/sma/smartv3/model/AppUser;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getBirthday()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getAgeByBirth(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "height"

    iget-object v3, v1, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;

    invoke-static {v3}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->access$getAppUser$p(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Lcom/sma/smartv3/model/AppUser;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "gender"

    iget-object v3, v1, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;

    invoke-static {v3}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->access$getAppUser$p(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Lcom/sma/smartv3/model/AppUser;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getGender()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    const/4 v4, 0x0

    :cond_0
    invoke-virtual {v2, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->access$getMVtDeviceScale$p(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Lcom/vtrump/vtble/XO0O10;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v2}, Lcom/vtrump/vtble/XO0O10;->XX00i10X(Lorg/json/JSONObject;)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/X01O1XO0i;->IiI10X()I

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, v1, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;

    new-instance v3, Lcom/sma/smartv3/db/entity/Weight;

    const v84, 0x1fffff

    const/16 v85, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const/16 v48, 0x0

    const-wide/16 v49, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const-wide/16 v53, 0x0

    const/16 v55, 0x0

    const-wide/16 v56, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const-wide/16 v60, 0x0

    const-wide/16 v62, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const-wide/16 v67, 0x0

    const/16 v69, 0x0

    const-wide/16 v70, 0x0

    const/16 v72, 0x0

    const-wide/16 v73, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const-wide/16 v77, 0x0

    const/16 v79, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v83, -0x1

    invoke-direct/range {v3 .. v85}, Lcom/sma/smartv3/db/entity/Weight;-><init>(IJLjava/lang/String;FIIDDDDDDDDDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DDDDDLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->access$setMWeight$p(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;Lcom/sma/smartv3/db/entity/Weight;)V

    iget-object v2, v1, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->access$getMWeight$p(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Lcom/sma/smartv3/db/entity/Weight;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Lcom/sma/smartv3/db/entity/Weight;->setBodyFatScale(Lcom/android/mltcode/paycertificationapi/X01O1XO0i;)V

    :cond_3
    iget-object v2, v1, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->access$getTvWeightValue(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Landroid/widget/TextView;

    move-result-object v2

    iget-object v3, v1, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;

    invoke-static {v3}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->access$getMWeight$p(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)Lcom/sma/smartv3/db/entity/Weight;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    :goto_1
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v1, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->access$handlerMeasureDoneState(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Done - > "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void

    :cond_5
    iget-object v2, v1, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v2, v0}, Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;->access$handlerMeasureErrorState(Lcom/sma/smartv3/ui/status/BodyFatScaleActivity;Lcom/android/mltcode/paycertificationapi/X01O1XO0i;)V

    return-void
.end method
