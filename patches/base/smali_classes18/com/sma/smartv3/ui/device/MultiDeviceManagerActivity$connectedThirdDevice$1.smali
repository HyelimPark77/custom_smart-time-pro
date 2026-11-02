.class final Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->connectedThirdDevice(Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;)Lkotlinx/coroutines/XiOIO;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.device.MultiDeviceManagerActivity$connectedThirdDevice$1"
    f = "MultiDeviceManagerActivity.kt"
    i = {}
    l = {
        0xc4
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $a2dpInfo:Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;",
            "Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->$a2dpInfo:Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->$a2dpInfo:Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;-><init>(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 171

    move-object/from16 v0, p0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    sget-object v2, Lcom/sma/smartv3/dto/OXO1;->I0iXXO:Lcom/sma/smartv3/dto/OXO1$OXO1;

    invoke-virtual {v2}, Lcom/sma/smartv3/dto/OXO1$OXO1;->XOO0ii0()Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v1

    :cond_2
    iget-object v2, v0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->access$getConnectingDeviceAddress$p(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Ljava/lang/String;

    move-result-object v2

    iget-object v5, v0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->$a2dpInfo:Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;

    invoke-virtual {v5}, Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;->getAddress()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v1

    :cond_3
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v5, v0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    invoke-static {v5}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->access$getConnectingDeviceName$p(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    invoke-static {v6}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->access$getConnectingDeviceAddress$p(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "connectedThirdDevice:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->$a2dpInfo:Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;

    invoke-virtual {v2}, Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;->getOnline()Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_5

    new-instance v6, Lcom/sma/smartv3/dto/OXO1;

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->access$getConnectingDeviceName$p(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Ljava/lang/String;

    move-result-object v7

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->access$getConnectingDeviceAddress$p(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Ljava/lang/String;

    move-result-object v8

    const/16 v18, 0x7f8

    const/16 v19, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v6 .. v19}, Lcom/sma/smartv3/dto/OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v6, v5, v3, v4}, Lcom/sma/smartv3/dto/OXO1;->IXXOO(Lcom/sma/smartv3/dto/OXO1;ZILjava/lang/Object;)V

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    new-instance v5, Lcom/szabh/smable3/entity/BleDeviceInfo;

    iget-object v6, v0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    invoke-static {v6}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->access$getConnectingDeviceName$p(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Ljava/lang/String;

    move-result-object v8

    iget-object v6, v0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    invoke-static {v6}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->access$getConnectingDeviceAddress$p(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Ljava/lang/String;

    move-result-object v10

    const v169, 0x3fffffff    # 1.9999999f

    const/16 v170, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const/16 v98, 0x0

    const/16 v99, 0x0

    const/16 v100, 0x0

    const/16 v101, 0x0

    const/16 v102, 0x0

    const/16 v103, 0x0

    const/16 v104, 0x0

    const/16 v105, 0x0

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v108, 0x0

    const/16 v109, 0x0

    const/16 v110, 0x0

    const/16 v111, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    const/16 v114, 0x0

    const/16 v115, 0x0

    const/16 v116, 0x0

    const/16 v117, 0x0

    const/16 v118, 0x0

    const/16 v119, 0x0

    const/16 v120, 0x0

    const/16 v121, 0x0

    const/16 v122, 0x0

    const/16 v123, 0x0

    const/16 v124, 0x0

    const/16 v125, 0x0

    const/16 v126, 0x0

    const/16 v127, 0x0

    const/16 v128, 0x0

    const/16 v129, 0x0

    const/16 v130, 0x0

    const/16 v131, 0x0

    const/16 v132, 0x0

    const/16 v133, 0x0

    const/16 v134, 0x0

    const/16 v135, 0x0

    const/16 v136, 0x0

    const/16 v137, 0x0

    const/16 v138, 0x0

    const/16 v139, 0x0

    const/16 v140, 0x0

    const/16 v141, 0x0

    const/16 v142, 0x0

    const/16 v143, 0x0

    const/16 v144, 0x0

    const/16 v145, 0x0

    const/16 v146, 0x0

    const/16 v147, 0x0

    const/16 v148, 0x0

    const/16 v149, 0x0

    const/16 v150, 0x0

    const/16 v151, 0x0

    const/16 v152, 0x0

    const/16 v153, 0x0

    const/16 v154, 0x0

    const/16 v155, 0x0

    const/16 v156, 0x0

    const/16 v157, 0x0

    const/16 v158, 0x0

    const/16 v159, 0x0

    const/16 v160, 0x0

    const/16 v161, 0x0

    const/16 v162, 0x0

    const/16 v163, 0x0

    const/16 v164, 0x0

    const/16 v165, -0x15

    const/16 v166, -0x1

    const/16 v167, -0x1

    const/16 v168, -0x1

    invoke-direct/range {v5 .. v170}, Lcom/szabh/smable3/entity/BleDeviceInfo;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJILjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;IIIIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v5}, Lcom/szabh/smable3/component/BleCache;->setMDeviceInfo(Lcom/szabh/smable3/entity/BleDeviceInfo;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->O00()Lcom/android/mltcode/paycertificationapi/g10;

    move-result-object v2

    new-instance v5, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1$1;

    iget-object v6, v0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    invoke-direct {v5, v6, v4}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1$1;-><init>(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$connectedThirdDevice$1;->label:I

    invoke-static {v2, v5, v0}, Lcom/android/mltcode/paycertificationapi/I100X1;->I0IIOi(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_0
    const-string v1, "refresh_main"

    const/4 v2, 0x2

    invoke-static {v1, v4, v2, v4}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_1

    :cond_5
    const-string v1, "\u8fde\u63a5\u5931\u8d25"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v1
.end method
