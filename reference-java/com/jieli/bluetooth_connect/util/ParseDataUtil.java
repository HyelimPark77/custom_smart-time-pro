package com.jieli.bluetooth_connect.util;

import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.jieli.bluetooth_connect.bean.BluetoothOption;
import com.jieli.bluetooth_connect.bean.ble.BleScanMessage;
import com.jieli.p600bt.decryption.HashDecryption;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class ParseDataUtil {
    private static final String TAG = "ParseDataUtil";
    private static final char[] mChars = "0123456789ABCDEF".toCharArray();

    public static String hexDataCovetToAddress(byte[] data) {
        StringBuilder sb = new StringBuilder();
        if (data != null && data.length == 6) {
            for (int i = 0; i < data.length; i++) {
                char[] cArr = mChars;
                sb.append(cArr[(data[i] & 255) >> 4]);
                sb.append(cArr[data[i] & 15]);
                if (i != data.length - 1) {
                    sb.append(CertificateUtil.DELIMITER);
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a3 A[RETURN] */
    public static BleScanMessage isFilterBleDevice(BluetoothOption option, byte[] scanData) {
        char c;
        if (option != null && scanData != null && scanData.length > 0) {
            int length = scanData.length;
            int i = 0;
            while (true) {
                int i2 = i + 2;
                if (i2 > length) {
                    break;
                }
                int iByteToInt = CHexConverter.byteToInt(scanData[i]);
                if (iByteToInt == 0) {
                    i++;
                } else {
                    if (iByteToInt < 1 || iByteToInt >= length - i) {
                        break;
                    }
                    int i3 = i + 1;
                    if (CHexConverter.byteToInt(scanData[i3]) == 255) {
                        if (i3 + iByteToInt <= length) {
                            int i4 = iByteToInt - 1;
                            byte[] bArr = new byte[i4];
                            System.arraycopy(scanData, i2, bArr, 0, i4);
                            if (i4 <= 2) {
                                break;
                            }
                            byte[] bArr2 = new byte[2];
                            System.arraycopy(bArr, 0, bArr2, 0, 2);
                            int iBytesToInt = CHexConverter.bytesToInt(bArr2[1], bArr2[0]);
                            int i5 = iByteToInt - 3;
                            byte[] bArr3 = new byte[i5];
                            System.arraycopy(bArr, 2, bArr3, 0, i5);
                            BleScanMessage withOTAFlagFilter = parseWithOTAFlagFilter(bArr, option.getOtaScanFilterData());
                            if (withOTAFlagFilter == null) {
                                int bleScanStrategy = option.getBleScanStrategy();
                                if (bleScanStrategy != 1) {
                                    if (bleScanStrategy == 2) {
                                        withOTAFlagFilter = parseBleScanMsg(2, bArr3, bArr);
                                    } else if (bleScanStrategy == 3) {
                                        withOTAFlagFilter = parseBleScanMsg(3, bArr3, bArr);
                                        c = 3;
                                    }
                                    c = 2;
                                } else {
                                    withOTAFlagFilter = parseBleScanMsg(3, bArr3, bArr);
                                    if (withOTAFlagFilter == null) {
                                        withOTAFlagFilter = parseBleScanMsg(2, bArr3, bArr);
                                        c = 2;
                                    } else {
                                        c = 3;
                                    }
                                }
                                if (withOTAFlagFilter == null) {
                                    break;
                                }
                                if (c != 2) {
                                    if (c != 3) {
                                        break;
                                    }
                                    return withOTAFlagFilter;
                                }
                                withOTAFlagFilter.setVid(iBytesToInt);
                                String flagContent = withOTAFlagFilter.getFlagContent();
                                if (TextUtils.isEmpty(flagContent) || !flagContent.equals(option.getScanFilterData())) {
                                    break;
                                }
                                return withOTAFlagFilter;
                            }
                            return withOTAFlagFilter;
                        }
                        JL_Log.m26849e(TAG, "isFilterBleDevice", "totalLen is error.");
                        return null;
                    }
                    i += iByteToInt + 1;
                }
            }
        }
        return null;
    }

    private static BleScanMessage parseBleScanMsg(int filterWay, byte[] data, byte[] manufacturerData) {
        if (filterWay == 2) {
            return parseWithFlagFilter(data);
        }
        if (filterWay != 3) {
            return null;
        }
        return parseWithHashFilter(manufacturerData);
    }

    public static BleScanMessage parseOTAFlagFilterWithBroad(byte[] advData, String filterFlag) {
        BleScanMessage withOTAFlagFilter = null;
        if (advData != null && advData.length > 2) {
            int i = 0;
            while (true) {
                int i2 = i + 2;
                if (i2 <= advData.length) {
                    int iByteToInt = CHexConverter.byteToInt(advData[i]);
                    if (iByteToInt != 0) {
                        if (iByteToInt < 1) {
                            break;
                        }
                        int i3 = i + 1;
                        if (i3 + iByteToInt >= advData.length) {
                            break;
                        }
                        if (CHexConverter.byteToInt(advData[i3]) == 255) {
                            int i4 = iByteToInt - 1;
                            byte[] bArr = new byte[i4];
                            System.arraycopy(advData, i2, bArr, 0, i4);
                            withOTAFlagFilter = parseWithOTAFlagFilter(bArr, filterFlag);
                            if (withOTAFlagFilter != null) {
                                return withOTAFlagFilter;
                            }
                        }
                        i += iByteToInt + 1;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            }
        }
        return withOTAFlagFilter;
    }

    private static BleScanMessage parseTwsADV(byte[] data, BleScanMessage message) {
        if (data == null || message == null) {
            return null;
        }
        int deviceType = message.getDeviceType();
        if (deviceType != 0) {
            if (deviceType == 1) {
                return parseWithChargingBin(data, message);
            }
            if (deviceType != 2) {
                if (deviceType == 3) {
                    return parseWithTwsVer2(data, message);
                }
                if (deviceType != 4) {
                    if (deviceType != 5) {
                        return null;
                    }
                    return parseWithWatch(data, message);
                }
            }
        }
        return parseWithTwsVer1(data, message);
    }

    private static BleScanMessage parseWithChargingBin(byte[] data, BleScanMessage message) {
        if (message == null || message.getVersion() > 1 || (message.getVersion() == 0 && data.length != 29)) {
            return null;
        }
        if (data.length < 16) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(data);
        byteBufferWrap.get(new byte[7]);
        byte[] bArr = new byte[6];
        ByteBuffer byteBuffer = byteBufferWrap.get(bArr);
        String strHexDataCovetToAddress = hexDataCovetToAddress(bArr);
        byte b = byteBuffer.get();
        int i = (b >> 7) & 1;
        int i2 = (b >> 6) & 1;
        int i3 = b & 15;
        byte b2 = byteBuffer.get();
        int i4 = (b2 >> 7) & 1;
        int i5 = b2 & 127;
        byte b3 = byteBuffer.get();
        int i6 = (b3 >> 7) & 1;
        int i7 = b3 & 127;
        byte b4 = byteBuffer.get();
        int i8 = (b4 >> 7) & 1;
        int i9 = b4 & 127;
        int iByteToInt = CHexConverter.byteToInt(byteBuffer.get());
        if (message.getVersion() != 0) {
            byteBuffer.rewind();
            message.setEdrAddr(strHexDataCovetToAddress).setSeq(iByteToInt).setTwsFlag(i).setChargingBinStatus(i2).setAction(i3).setEdrStatus(i3).setLeftCharging(i4 == 1).setLeftDeviceQuantity(i5).setRightCharging(i6 == 1).setRightDeviceQuantity(i7).setDeviceCharging(i8 == 1).setChargingBinQuantity(i9);
            return message;
        }
        int i10 = (byteBuffer.get() >> 7) & 1;
        byte[] bArr2 = new byte[8];
        byteBuffer.get(new byte[2]).get(bArr2).rewind();
        byte[] bArr3 = new byte[16];
        System.arraycopy(data, 0, bArr3, 0, 16);
        byte[] bArr4 = new byte[16];
        HashDecryption.decrypt(bArr3, 16, new byte[]{b, b2, b3, b4}, 4, bArr4);
        byte[] bArr5 = new byte[8];
        int i11 = 0;
        while (i11 < 8) {
            int i12 = i11 + 1;
            bArr5[i11] = bArr4[i11 + i12];
            i11 = i12;
        }
        if (!Arrays.equals(bArr2, bArr5)) {
            return null;
        }
        message.setEdrAddr(strHexDataCovetToAddress).setSeq(iByteToInt).setTwsFlag(i).setChargingBinStatus(i2).setAction(i3).setEdrStatus(i3).setLeftCharging(i4 == 1).setLeftDeviceQuantity(i5).setRightCharging(i6 == 1).setRightDeviceQuantity(i7).setDeviceCharging(i8 == 1).setChargingBinQuantity(i9).setChargingBinMode(i10).setHash(bArr2);
        return message;
    }

    private static BleScanMessage parseWithFlagFilter(byte[] data) {
        int iByteToInt;
        if (data == null || data.length <= 0) {
            return null;
        }
        int length = data.length;
        BleScanMessage bleScanMessage = null;
        int i = 0;
        while (true) {
            int i2 = i + 2;
            if (i2 > length || (iByteToInt = CHexConverter.byteToInt(data[i])) <= 0) {
                break;
            }
            int iByteToInt2 = CHexConverter.byteToInt(data[i + 1]);
            int i3 = iByteToInt - 1;
            byte[] bArr = new byte[i3];
            if (i3 <= 0 || i3 + i + 2 > length) {
                return null;
            }
            System.arraycopy(data, i2, bArr, 0, i3);
            i += iByteToInt + 1;
            if (bleScanMessage == null) {
                bleScanMessage = new BleScanMessage();
            }
            if (iByteToInt2 != 0) {
                if (iByteToInt2 != 1) {
                    if (iByteToInt2 == 2) {
                        bleScanMessage.setPhoneVirtualAddress(bArr);
                    } else if (iByteToInt2 != 3) {
                        if (iByteToInt2 == 4 && i3 >= 6) {
                            byte[] bArr2 = new byte[6];
                            System.arraycopy(bArr, 0, bArr2, 0, 6);
                            bleScanMessage.setEdrAddr(hexDataCovetToAddress(bArr2));
                            if (i3 >= 7) {
                                bleScanMessage.setEdrStatus(CHexConverter.byteToInt(bArr[6]));
                                if (i3 >= 8) {
                                    byte b = bArr[7];
                                    int i4 = (b >> 7) & 1;
                                    int i5 = b & 127;
                                    bleScanMessage.setLeftCharging(i4 == 1);
                                    bleScanMessage.setLeftDeviceQuantity(i5);
                                }
                            }
                        }
                    } else if (i3 >= 3) {
                        bleScanMessage.setPid(CHexConverter.bytesToInt(bArr[1], bArr[0]));
                        bleScanMessage.setShowDialog(CHexConverter.byteToInt(bArr[2]) == 1);
                    }
                } else if (i3 == 1) {
                    bleScanMessage.setPairedFlag(CHexConverter.byteToInt(bArr[0]));
                }
            } else {
                bleScanMessage.setFlagContent(new String(bArr));
            }
        }
        return bleScanMessage;
    }

    private static BleScanMessage parseWithHashFilter(byte[] data) {
        if (data == null || data.length < 7) {
            return null;
        }
        byte[] bArr = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).get(bArr);
        int iBytesToInt = CHexConverter.bytesToInt(bArr[1], bArr[0]);
        ByteBuffer byteBuffer2 = byteBuffer.get(bArr);
        int iBytesToInt2 = CHexConverter.bytesToInt(bArr[1], bArr[0]);
        ByteBuffer byteBuffer3 = byteBuffer2.get(bArr);
        int iBytesToInt3 = CHexConverter.bytesToInt(bArr[1], bArr[0]);
        byte b = byteBuffer3.get();
        BleScanMessage showDialog = new BleScanMessage().setVid(iBytesToInt).setUid(iBytesToInt2).setPid(iBytesToInt3).setDeviceType((b >> 4) & 255).setVersion(b & 15).setShowDialog(true);
        if (data.length > 7) {
            return parseTwsADV(data, showDialog);
        }
        return null;
    }

    public static BleScanMessage parseWithOTAFlagFilter(byte[] manufacturerData, String filterFlag) {
        if (manufacturerData == null || filterFlag == null || filterFlag.length() == 0 || manufacturerData.length <= filterFlag.getBytes().length + 2) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(manufacturerData);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        short s = byteBufferWrap.getShort();
        byte[] bArr = new byte[filterFlag.getBytes().length];
        ByteBuffer byteBuffer = byteBufferWrap.get(bArr);
        if (!Arrays.equals(reverseBuf(bArr), filterFlag.getBytes())) {
            return null;
        }
        int iByteToInt = CHexConverter.byteToInt(byteBuffer.get());
        JL_Log.m26847d(TAG, "parseWithOTAFlagFilter", "version :" + iByteToInt);
        if (iByteToInt == 0) {
            byte[] bArr2 = new byte[6];
            ByteBuffer byteBuffer2 = byteBuffer.get(bArr2);
            String strHexDataCovetToAddress = hexDataCovetToAddress(reverseBuf(bArr2));
            byte[] bArr3 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr3);
            return new BleScanMessage().setOTA(true).setVid(s).setOtaADVVersion(iByteToInt).setOtaBleAddress(strHexDataCovetToAddress).setOtaADVReserve(bArr3);
        }
        if (iByteToInt != 1) {
            JL_Log.m26851i(TAG, "parseWithOTAFlagFilter", "Not support version : " + iByteToInt);
            return null;
        }
        byte[] bArr4 = new byte[6];
        ByteBuffer byteBuffer3 = byteBuffer.get(bArr4);
        String strHexDataCovetToAddress2 = hexDataCovetToAddress(reverseBuf(bArr4));
        short s2 = byteBuffer3.getShort();
        short s3 = byteBuffer3.getShort();
        byte b = byteBuffer3.get();
        int iByteToInt2 = CHexConverter.byteToInt(byteBuffer3.get());
        byte[] bArr5 = new byte[byteBuffer3.remaining()];
        byteBuffer3.get(bArr5);
        return new BleScanMessage().setOTA(true).setOtaADVVersion(iByteToInt).setOtaBleAddress(strHexDataCovetToAddress2).setVid(s).setUid(s2).setPid(s3).setDeviceType((b >> 4) & 255).setVersion(b & 15).setLeftDeviceQuantity(iByteToInt2).setOtaADVReserve(bArr5);
    }

    private static BleScanMessage parseWithTwsVer1(byte[] bArr, BleScanMessage bleScanMessage) {
        int i;
        if (bArr.length != 29) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.get(new byte[7]);
        byte[] bArr2 = new byte[6];
        ByteBuffer byteBuffer = byteBufferWrap.get(bArr2);
        String strHexDataCovetToAddress = hexDataCovetToAddress(bArr2);
        byte b = byteBuffer.get();
        int iByteToInt = CHexConverter.byteToInt(b);
        byte b2 = byteBuffer.get();
        int i2 = (b2 >> 7) & 1;
        int i3 = b2 & 127;
        byte b3 = byteBuffer.get();
        int i4 = (b3 >> 7) & 1;
        int i5 = b3 & 127;
        byte b4 = byteBuffer.get();
        int i6 = (b4 >> 7) & 1;
        int i7 = b4 & 127;
        int iByteToInt2 = CHexConverter.byteToInt(byteBuffer.get());
        byte b5 = (bleScanMessage.getVersion() == 1 || bleScanMessage.getVersion() == 2) ? byteBuffer.get() : (byte) 0;
        if (bleScanMessage.getVersion() != 1) {
            i = bleScanMessage.getVersion() == 2 ? 2 : 3;
        } else {
            i = 2;
        }
        byte[] bArr3 = new byte[8];
        byteBuffer.get(new byte[i]).get(bArr3).rewind();
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, 0, bArr4, 0, 16);
        byte[] bArr5 = {b, b2, b3, b4};
        byte[] bArr6 = new byte[16];
        byte b6 = b5;
        HashDecryption.decrypt(bArr4, 16, bArr5, 4, bArr6);
        byte[] bArr7 = new byte[8];
        int i8 = 0;
        while (i8 < 8) {
            int i9 = i8 + 1;
            bArr7[i8] = bArr6[i8 + i9];
            i8 = i9;
        }
        if (!Arrays.equals(bArr3, bArr7)) {
            return null;
        }
        bleScanMessage.setEdrAddr(strHexDataCovetToAddress).setSeq(iByteToInt2).setAction(iByteToInt).setEdrStatus(iByteToInt).setLeftCharging(i2 == 1).setLeftDeviceQuantity(i3).setRightCharging(i4 == 1).setRightDeviceQuantity(i5).setDeviceCharging(i6 == 1).setChargingBinQuantity(i7).setHash(bArr3);
        if (bleScanMessage.getVersion() == 1) {
            bleScanMessage.setEnableConnect(CHexConverter.checkBitValue(b6, 0)).setSupportChargingCase(CHexConverter.checkBitValue(b6, 1));
            return bleScanMessage;
        }
        if (bleScanMessage.getVersion() == 2) {
            bleScanMessage.setConnectWay(CHexConverter.checkBitValue(b6, 0) ? 1 : 0).setSupportChargingCase(CHexConverter.checkBitValue(b6, 1));
        }
        return bleScanMessage;
    }

    private static BleScanMessage parseWithTwsVer2(byte[] data, BleScanMessage message) {
        if (data.length < 10) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(data);
        byteBufferWrap.get(new byte[7]);
        byte b = byteBufferWrap.get();
        int i = (b >> 7) & 1;
        int i2 = b & 127;
        byte b2 = byteBufferWrap.get();
        int i3 = (b2 >> 7) & 1;
        int i4 = b2 & 127;
        byte b3 = byteBufferWrap.get();
        message.setTwsFlag((b3 >> 7) & 1).setMainDevFlag((b3 >> 6) & 1).setEnableConnect(((b3 >> 5) & 1) == 1).setAction(b3 & 15).setLeftCharging(i == 1).setLeftDeviceQuantity(i2).setRightCharging(i3 == 1).setRightDeviceQuantity(i4);
        return message;
    }

    private static BleScanMessage parseWithWatch(byte[] data, BleScanMessage message) {
        if (data.length < 14) {
            return null;
        }
        byte[] bArr = new byte[6];
        System.arraycopy(data, 7, bArr, 0, 6);
        message.setEdrAddr(hexDataCovetToAddress(bArr));
        int i = data[13];
        message.setConnectWay((i >> 7) & 1);
        message.setAction(i & 15);
        return message;
    }

    private static byte[] reverseBuf(byte[] data) {
        if (data == null || data.length <= 1) {
            return data;
        }
        byte[] bArr = new byte[data.length];
        for (int i = 0; i < data.length; i++) {
            bArr[i] = data[(data.length - i) - 1];
        }
        return bArr;
    }
}
